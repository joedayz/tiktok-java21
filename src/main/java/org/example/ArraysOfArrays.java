package org.example;

import java.util.Arrays;

public class ArraysOfArrays {


    public static void main(String[] args) {
        int[][] vars1;
        int vars2 [][];
        int[] vars3[];
        int[] vars4[], space[][];   //2d y 3d array

        String[][] rectangle = new String[3][4];

        rectangle[0][1] = "joe";

        int[][] big = { {1, 4}, {3},
                {1, 2, 3, 4, 5}};
        System.out.println(Arrays.toString(big[0]));

        for(int[] inner: big){
            for(int num: inner){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
