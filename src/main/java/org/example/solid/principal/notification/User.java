package org.example.solid.principal.notification;

public class User {
   private String name;
    private Notification notification;

    public User(String name, Notification notification){
        this.name = name;
        this.notification = notification;
    }

    public void setNotificationPreference(Notification notification){
        this.notification = notification;
    }

    public void sendNotification(String message){
        notification.sendNotification(message);
    }
}
