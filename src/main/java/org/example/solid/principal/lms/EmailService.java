package org.example.solid.principal.lms;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
