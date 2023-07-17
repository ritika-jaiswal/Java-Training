package org.example.javacoreapi.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
//        Creating and Manipulating dates and times
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Creating and Manipulating dates and times");
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

//        Formatting and parsing dates and times
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        LocalDateTime futureDateTime = LocalDateTime.parse("2023-07-17 10:30:00", formatter);
        System.out.println("\nFormatting and parsing dates and times");

        System.out.println(formatter);
        System.out.println(formattedDateTime);
        System.out.println(futureDateTime);


//         Working with Instant for machine-based time calculations
        Instant instant = Instant.now();
        long epochSeconds = instant.getEpochSecond();

        System.out.println("\nWorking with Instant for machine-based time calculations");
        System.out.println(instant);
        System.out.println(epochSeconds);

    }
}
