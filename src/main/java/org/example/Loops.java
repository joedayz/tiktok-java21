package org.example;

import java.util.List;

public class Loops {

    public static void main(String[] args) {
//        int counter = 0;
//        while (counter < 10) {
//            double price = counter * 10;
//            System.out.println("Price: " + price);
//            counter++;
//        }

        int full = 5;
        while(full<5){
            System.out.println("Not full");
            full++;
        }

//        int lizard = 0;
//        do {
//            lizard++;
//        } while (false);
//        System.out.println("Lizard: " + lizard);


//        int pen =2;
//        int pigs = 5;
//        while(pen<10)
//            pigs++;

//        int i;
//        for (i = 0; i < 10; i++)
//            System.out.println("i="+i);
//
//        System.out.println(i);


//        for(var counter=5; counter>=0; counter--){
//            System.out.println("Counter: " + counter);
//        }
//
//        for(;;)
//            System.out.println("JoeDayz");


        //int x = 0;
//        for (long y=0, z=4; x<5 && y<10; x++, y++) {
//            System.out.println("y=" + y);
//        }
//        System.out.println("x="+x);

//        for (long y=0, int z = 4; x < 5; x++) {
//            System.out.println(x + " ");
//        }
//
//        for(long y=0, x=4; x<5 && y<10; x++, y++)
//            System.out.println("y=" + y);
//
//        System.out.println(x);

//        String[] names = {"Juan", "Maria", "Pedro"};
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        List<String> namesList = List.of("Juan", "Maria",
//                "Pedro");
//        for (var name : namesList) {
//            System.out.println(name);
//        }

//        for(int name : namesList){
//
//        }

//        int[][] myComplexArray = {{1,2,3},{4,5,6},{7,8,9}};
//        for(int[] row : myComplexArray){
//            for(int value : row){
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }

        int hungry = 8;
        while(hungry > 0){
           do{
               hungry -=2;
           }while(hungry>5);
           hungry--;
            System.out.println("hungry="+hungry);
        }







    }

}
