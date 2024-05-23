/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bf.sonabel.gestionnotification.api;

import bf.sonabel.gestionnotification.notification.Notification;
import java.util.List;

/**
 *
 * @author sonabel
 */
public interface NotificationInterfaceApi {
    List<Notification> createListNotifications(List<Notification> listNotifications);
}
