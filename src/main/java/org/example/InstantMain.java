package org.example;

import java.time.*;

import static java.lang.Thread.sleep;

public class InstantMain {

    public static void main(String[] args) throws InterruptedException {
        var now = Instant.now();
        //....
        sleep(5000);
        var later = Instant.now();

        var duration = Duration.between(now, later);
        System.out.println("Duration: " + duration.toMillis());


        var date = LocalDate.of(2025,
                5, 25);
        var time = LocalTime.of(11, 55, 00);
        var zone = ZoneId.of("US/Eastern");
        var zonedDateTime = ZonedDateTime.of(date, time, zone);


        var instant = zonedDateTime.toInstant();
        System.out.println(instant);
        System.out.println(zonedDateTime);







    }
}
