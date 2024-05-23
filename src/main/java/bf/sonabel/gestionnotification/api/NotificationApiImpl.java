/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.sonabel.gestionnotification.api;

import bf.sonabel.gestionnotification.notification.Notification;
import bf.sonabel.gestionnotification.service.NotificationRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author sonabel
 */
@Component
public class NotificationApiImpl implements NotificationInterfaceApi {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<Notification> createListNotifications(List<Notification> listNotifications) {
        //this.afficher();
        listNotifications.forEach(item -> item.setId(UUID.randomUUID().toString())); 
        return notificationRepository.saveAll(listNotifications);
    }
    

    public void afficher() {
        System.out.println("Bonjour");
    }

    @Override
    public List<Notification> getListNotifications() {
        return notificationRepository.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
}
