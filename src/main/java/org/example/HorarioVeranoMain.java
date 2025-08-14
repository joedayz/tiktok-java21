package org.example;

import java.time.*;

public class HorarioVeranoMain {

    public static void main(String[] args) {
        //Spring - Marzo
        //1:59am - 3:00 am
        var date = LocalDate.of(2025, Month.MARCH,

                9);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime);

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);

        //November
        //1:59am - 1:00am - 2:00am

        var date2 = LocalDate.of(2025,
                Month.NOVEMBER,
                2);
        var time2 = LocalTime.of(1, 30);
        var zone2 = ZoneId.of("US/Eastern");
        var dateTime2 = ZonedDateTime.of(date2, time2,
                zone2);
        System.out.println(dateTime2);

        dateTime2 = dateTime2.plusHours(1);
        System.out.println(dateTime2);

        //Ojo
        var dateOjo = LocalDate.of(2025,
                Month.MARCH, 9);
        var timeOjo = LocalTime.of(2, 30);
        var zoneOjo = ZoneId.of("US/Eastern");
        var dateTimeOjo = ZonedDateTime.of(dateOjo,
                timeOjo, zoneOjo);
        System.out.println(dateTimeOjo);


    }
}
