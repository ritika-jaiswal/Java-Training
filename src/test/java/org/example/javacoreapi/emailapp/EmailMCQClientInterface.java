package org.example.javacoreapi.emailapp;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class EmailMCQClientInterface {
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]$";
    private static Email email;

    @BeforeClass
    public static void setUp() {
        email = new Email("John", "Doe", "@example.com");
    }

//    @Test
//    public void testSetDepartment() {
//        email.setDepartment("sales");
//        assertEquals("sales", email.getDepartment());
//
//        email.setDepartment("Development");
//        assertEquals("Development", email.getDepartment());
//
//        email.setDepartment("Accounting");
//        assertEquals("Accounting", email.getDepartment());
//
//        email.setDepartment("");
//        assertEquals("", email.getDepartment());
//    }

    @Test
    public void testRandomPassword() {
        String randomPassword = email.randomPassword(10, passwordRegex);
        assertNotNull(randomPassword);
        assertTrue(randomPassword.matches(passwordRegex));
    }

    @Test
    public void testChangePassword() {
        String newPassword = "NewPass123!";

        // Valid password
        email.changePassword(newPassword, passwordRegex);
        assertEquals(newPassword, email.getPassword());

        // Invalid password (does not match the regex)
        String invalidPassword2 = "weak password 12";
        email.changePassword(invalidPassword2, passwordRegex);
        assertNotEquals(invalidPassword2, email.getPassword());
    }

    @Test
    public void testShowInfo() {
        String expectedInfo = "\nDISPLAY NAME: John Doe\n" +
                "COMAPNY EMAIL: john.doe@Development@example.com\n" +
                "EMAIL PASSWORD: " + email.getPassword();

        assertEquals(expectedInfo, email.showInfo());
    }
}
