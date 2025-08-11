package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulandoDatesAndTimes {

    public static void main(String[] args) {
        var date = LocalDate.of(2025,
                Month.AUGUST, 9);
        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        date = LocalDate.of(2025,
                Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);

        date = LocalDate.of(2025,
                Month.FEBRUARY, 20);
        var differentDay = date.withDayOfMonth(15);
        System.out.println(differentDay);
        var differentMonth = date.withDayOfYear(3);
        System.out.println(differentMonth);
        var allChanged = date.withYear(2026)
                .withMonth(4)
                .withDayOfMonth(10);
        System.out.println(allChanged);


        date =LocalDate.of(2025, Month.MARCH,
                3);
        var withTime = date.atTime(5, 30);
        System.out.println(withTime);
        var start = date.atStartOfDay();
        System.out.println(start);



























    }
}
