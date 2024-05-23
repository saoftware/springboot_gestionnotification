/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package bf.sonabel.gestionnotification.service;

import bf.sonabel.gestionnotification.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sonabel
 */
public interface NotificationRepository extends JpaRepository<Notification, String> {
    
}
