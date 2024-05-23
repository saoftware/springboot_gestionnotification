package bf.sonabel.gestionnotification;

import bf.sonabel.gestionnotification.notification.EmailNotification;
import bf.sonabel.gestionnotification.notification.Notification;
import bf.sonabel.gestionnotification.notification.SMSNotification;
import bf.sonabel.gestionnotification.service.NotificationService;
import jakarta.persistence.Id;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class GestionnotificationApplication {

        //private NotificationService notificationService;
        
	public static void main(String[] args) {
            
            
            ConfigurableApplicationContext context = SpringApplication.run(GestionnotificationApplication.class, args);
            
            List<Notification> listNotifications = new ArrayList<>();
            
            SMSNotification smsNotification = new SMSNotification();
            EmailNotification emailNotification= new EmailNotification();

            smsNotification.setNumeroTelephone("70556633");
            smsNotification.setNom("Smith");
            smsNotification.setPrenom("John");
            smsNotification.setId(UUID.randomUUID().toString());
            
            emailNotification.setId(UUID.randomUUID().toString());
            emailNotification.setNom("Barro");
            emailNotification.setPrenom("Pond");
            emailNotification.setEmail("test@gmail.com");
            
            listNotifications.add(smsNotification);
            listNotifications.add(emailNotification);
        
            context.getBean(NotificationService.class).sendNotification(listNotifications);
	}
      
}
