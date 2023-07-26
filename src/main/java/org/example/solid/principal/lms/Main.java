package org.example.solid.principal.lms;

// Java project that demonstrates the Single Responsibility Principle
// and the Dependency Inversion Principle
public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceImpl();

        Library library = new Library(emailService);

        String userId = "87657";
        String message = "Your borrowed book is overdue";

        library.sendNotificationToUser(userId,message);
    }
}
