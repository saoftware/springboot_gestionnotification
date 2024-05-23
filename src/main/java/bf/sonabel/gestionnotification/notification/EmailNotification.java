package bf.sonabel.gestionnotification.notification;

import jakarta.persistence.Entity;

@Entity
public class EmailNotification extends Notification {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
