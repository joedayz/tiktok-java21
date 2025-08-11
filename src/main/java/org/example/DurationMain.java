package org.example;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationMain {

    public static void main(String[] args) {
        var daily = Duration.ofDays(1);
        System.out.println(daily);
        var hourly = Duration.ofHours(1);
        System.out.println(hourly);
        var everyMinute =  Duration.ofMinutes(1);
        System.out.println(everyMinute);
        var everyTenSeconds =  Duration.ofSeconds(10);
        System.out.println(everyTenSeconds);
        var everyMilli = Duration.ofMillis(1);
        System.out.println(everyMilli);
        var everyNano =  Duration.ofNanos(1);
        System.out.println(everyNano);


        var daily2 = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily2);
        var hourly2 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(hourly2);

        var one = LocalTime.of(5, 15);
        var two =  LocalTime.of(6, 55);
        var date = LocalDate.of(2025, 1,
                    20);
        System.out.println(ChronoUnit.HOURS.between(one, two));
        System.out.println(ChronoUnit.MINUTES.between(one, two));

        //System.out.println(ChronoUnit.MINUTES.between(one, date));

        LocalTime time2 = LocalTime.of(3,
                12, 45) ;
        System.out.println(time2);
        LocalTime truncated = time2.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated);




















    }
}
