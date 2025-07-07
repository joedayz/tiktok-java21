package org.example;

import java.util.Arrays;

public class Names {

    String[] names = new String[2];

    public static void main(String[] args) {
//        String[] s = {"StringValue"};
//        Object[] o = s;
//
//        String[] others = (String[])o;
//
//        //others[0] = new StringBuilder();
//        o[0]= new StringBuilder();

//        String[] names =  {"a", "b", "c"};
//
//        System.out.println(names.length);
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        //System.out.println(names[3]);

        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+5;
        }
        System.out.println(Arrays.toString(numbers));

        for(int n: numbers){
            System.out.print(n);
        }


    }
}
