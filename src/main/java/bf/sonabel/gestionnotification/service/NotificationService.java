/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package bf.sonabel.gestionnotification.service;

import bf.sonabel.gestionnotification.api.NotificationInterfaceApi;
import bf.sonabel.gestionnotification.notification.EmailNotification;
import bf.sonabel.gestionnotification.notification.Notification;
import bf.sonabel.gestionnotification.notification.SMSNotification;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sonabel
 */
@Service
public class NotificationService {
    
    @Autowired
    private NotificationInterfaceApi notificationInterfaceApi;
    
    public List<Notification> sendNotification(List<Notification> listNotifications){
        //return notificationInterfaceApi.
        return notificationInterfaceApi.createListNotifications(listNotifications);
    }
    
    public List<Notification> getNotifications(){
        return notificationInterfaceApi.getListNotifications();
    }
    
}
