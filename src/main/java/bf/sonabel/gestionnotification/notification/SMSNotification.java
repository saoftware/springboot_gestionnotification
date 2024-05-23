package bf.sonabel.gestionnotification.notification;

import jakarta.persistence.Entity;

@Entity
public class SMSNotification extends Notification {
    private String numeroTelephone;

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}
