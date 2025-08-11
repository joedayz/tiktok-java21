package org.example;

import java.sql.SQLOutput;
import java.time.*;

public class PeriodsMain {

    public static void main(String[] args) {
        var start = LocalDate.of(2025,
                Month.JANUARY, 1);
        var end = LocalDate.of(2025,
                Month.MARCH, 30);

        var period = Period.ofMonths(1);

        performAnimalEnrichment(start, end, period);


        System.out.println(Period.of(1,
                2,3));

        System.out.println(Period.ofMonths(3));

        var xmas = LocalDate.of(2025,
                Month.DECEMBER,25);
        var newYear = LocalDate.of(2026,
                Month.JANUARY, 1);

        System.out.println(Period.between(xmas, newYear));
        System.out.println(Period.between(newYear, xmas));

        var date = LocalDate.of(2025,
                3, 20);
        var time = LocalTime.of(6, 15);
        var dateTime =  LocalDateTime.of(date, time);
        var period2 = Period.ofMonths(-1);
        System.out.println(date.plus(period2));

        System.out.println(dateTime.plus(period2));





    }

    private static void performAnimalEnrichment(
            LocalDate start, LocalDate end,
            Period period) {
        var upTo = start;
        while(upTo.isBefore(end)){
            upTo = upTo.plus(period);
        }
    }
}
