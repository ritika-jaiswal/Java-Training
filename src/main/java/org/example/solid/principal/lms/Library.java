package org.example.solid.principal.lms;
//The Library class has a single responsibility related to managing the library,
// and it depends on the EmailService abstraction rather than a specific implementation
public class Library {
    private EmailService emailService;

    public Library(EmailService emailService){
        this.emailService = emailService;
    }

    public void sendNotificationToUser(String userId, String message){
        String userEmail = getEmailAddressFromDatabase(userId);
        emailService.sendEmail(userEmail, "Library Notification", message);
    }

    public String getEmailAddressFromDatabase(String userId){
        return "ritika@exaze.com";
    }
}
