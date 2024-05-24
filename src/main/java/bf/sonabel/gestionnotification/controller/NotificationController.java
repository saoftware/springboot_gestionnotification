/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bf.sonabel.gestionnotification.controller;

import bf.sonabel.gestionnotification.notification.Notification;
import bf.sonabel.gestionnotification.service.NotificationRepository;
import bf.sonabel.gestionnotification.service.NotificationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sonabel
 */
@RestController

public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    
    @GetMapping("notifications/list")
    @Operation(summary = "Liste de notifications", tags = {"Notifications"})
    public List<Notification> getAllNotifications(){
        //return notificationService.
        return notificationService.getNotifications();
    }
    
    
    @PostMapping("notification/create")
    @Operation(summary = "Envoie une liste de notifications", tags = {"Notifications"})
    public List<Notification> create(@Parameter(name = "listNotifications", description = "Liste des notifications à envoyer") @RequestBody List<Notification> listNotifications){
        return notificationService.sendNotification(listNotifications);
    }
}
