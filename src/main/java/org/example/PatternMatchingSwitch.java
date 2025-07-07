package org.example;

public class PatternMatchingSwitch {

    static void printDetails(Number height) {
        String message = switch (height) {
            case Integer i -> "Rounded: " + i;
            case Double d -> "Double: " + d;
            case Number n -> "Unknown: " + n;
        };
        System.out.println(message);
    }

    public static void main(String[] args) {
//        printDetails(15.67);
//
//        System.out.println(getTrainer(14.5));
//
//
//        Number variableToTest = 25;
//
//        int result = switch (variableToTest){
//          case Integer x when x > 0 && x<= 20 -> 3;
//          case Integer x -> 5;
//          case Number n -> 10; //no es necesario default
//        };
//
//        System.out.println("Result: " + result);
//        Number fish = 10;
//        String name = switch (fish){
//          case Integer freshWater -> "Bass";
//          case Number saltWater -> "ClownFish";
//          //case String s -> "Shark";
//        };

//        Number zooPatrons = Integer.valueOf(1000);
//        switch (zooPatrons){
//            case Integer count -> System.out.println(count);
//            case Number count -> System.out.println("Too much");
//            //default -> System.out.println("Closed");
//        }

        String fish = null;

        System.out.println(switch (fish) {
            case "ClownFish" -> "Hello";
            case "BlueTang" -> "Hello again";
            case null -> "What type of fish are you?";
            default -> "Goodbye";
        });

        switch (fish) {
            case "ClownFish" : System.out.println("Hello");
            case "BlueTang" : System.out.println("Hello again");
            case null: System.out.println("What type of fish are you?");
            default: System.out.println("Goodbye");
        }


        System.out.println(switch (fish) {
            case String s when "ClownFish".equals(s) -> "Hello";
            case null -> "No good";
            case String s when "BlueTang".equals(s) -> "Hello again";
            default -> "Goodbye";
        });

//        System.out.println(switch (fish) {
//            case String s when "ClownFish".equals(s) -> "Hello";
//            case String s when "BlueTang".equals(s) -> "Hello again";
//            default -> "Goodbye";
//            case null -> "No good";
//        });







    }

    static String getTrainer(Number height) {
        return switch (height) {
            case Integer i when i > 10 -> "Joe";
            case Integer i -> "Daniel";
            case Double num when num <= 15.5 -> "Felipe";
            case Double num -> "Deborah";
            case Number num -> "Elias";
        };
    }


}
