package org.example.solid.principal.notification;

//Follow the basic principal of SRP and OCP in java
public class Main {
    public static void main(String[] args) {
        User emailUser = new User("Ritika", new EmailNotification());
        User smsUser = new User("Aaliya", new SMSNotification());

        emailUser.sendNotification("Hello, this is an email notification!");
        smsUser.sendNotification("Hi, This is an SMS Notification!");

        emailUser.setNotificationPreference(new SMSNotification());
        emailUser.sendNotification("This email will be sent as an SMS notification!");
    }
}
