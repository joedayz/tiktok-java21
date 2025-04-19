package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Season season = Season.SPRING;

        Season variable = Season.SUMMER;

        switch (season) {
            //case variable: break;
            //case getSeason(): break;
            case SPRING, SUMMER:
                System.out.println("calientes");
                break;
            case AUTUMN, Season.WINTER:
                System.out.println("frias");
                break;
        }


        String rpta = switch (variable){
            case SPRING -> "A";
            case SUMMER -> "B";
            case AUTUMN -> "C";
            case WINTER -> "D";
                default -> "E";
        };









    }

    static Season getSeason(){
        return Season.SUMMER;
    }
}

enum Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}