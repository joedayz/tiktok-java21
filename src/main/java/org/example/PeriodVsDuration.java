package org.example;

import java.time.*;

public class PeriodVsDuration {

    public static void main(String[] args) {
        var date = LocalDate.of(2025,
                1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime =  LocalDateTime.of(date, time);
        var duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration));
        System.out.println(time.plus(duration));
        //System.out.println(date.plus(duration));



        var date2 = LocalDate.of(2025,
                5, 25);
        var period = Period.ofDays(1);
        var days = Duration.ofDays(1);

        System.out.println(date2.plus(period));
        System.out.println(date2.plus(days));


        //Clase         |  Period   |  Duration
        //LocalDate     |   Si      |  No
        //LocalDateTime |   Si      |  Si
        //LocalTime     |   No      |  Si
        //ZonedDateTime |   Si      |  Si


    }
}
