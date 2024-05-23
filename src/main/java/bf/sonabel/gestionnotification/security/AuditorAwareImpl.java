/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.sonabel.gestionnotification.security;

import static java.util.Objects.isNull;
import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

/**
 *
 * @author sonabel
 */
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String username = this.extractUsernameFromAuthentication();
        return Optional.ofNullable(username);
    }

    public  String extractUsernameFromAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username;
        if ( isNull( authentication ) ) {
            return null;
        }
        if ( authentication instanceof JwtAuthenticationToken) {
            JwtAuthenticationToken token = (JwtAuthenticationToken) authentication;
            username = (String) ( token ).getTokenAttributes().get( "preferred_username" );
        } else {
            username = authentication.getName();
        }
        return username;
    }
}
