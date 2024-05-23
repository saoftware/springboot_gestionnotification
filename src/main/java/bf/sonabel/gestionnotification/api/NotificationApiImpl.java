/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.sonabel.gestionnotification.api;

import bf.sonabel.gestionnotification.notification.Notification;
import bf.sonabel.gestionnotification.service.NotificationRepository;
import java.util.List;
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
        return notificationRepository.saveAll(listNotifications);
    }

    public void afficher() {
        System.out.println("Bonjour");
    }
            
}
