/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.sonabel.gestionnotification.security;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

/**
 *
 * @author sonabel
 */
public class AuthoritiesConverter implements Converter<Jwt, Collection<GrantedAuthority>> {
    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public Collection<GrantedAuthority> convert(Jwt source) {
        Map<String, Object> realmAccess = source.getClaimAsMap("realm_access");

        if (Objects.nonNull(realmAccess)) {
            List<String> roles = (List<String>) realmAccess.get("roles");

            if (Objects.nonNull(roles)) {
                return roles.stream()
                        .map(rn -> new SimpleGrantedAuthority("ROLE_" + rn))
                        .collect(Collectors.toList());
            }
        }
        return List.of();
    }
}

