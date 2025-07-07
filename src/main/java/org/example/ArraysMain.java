package org.example;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {

        System.out.println(Arrays.mismatch(new int[]{1, 2, 3},
                new int[]{1, 2, 3})); //-1 son iguales

        System.out.println(Arrays.mismatch(new String[] {"a"},
                new String[]{"A"}));

        System.out.println(Arrays.mismatch(new int[] {1, 2, 3},
                new int[]{1}));

//        System.out.println(Arrays.compare(new int[]{1}, new int[]{1}));
//
//        System.out.println(Arrays.compare(new int[]{1,2 }, new int[]{1, 2}));
//
//        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"}));
//        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));
//
//        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null}));


//        System.out.println(new int[]{1} == new int[]{1}); //false
//
//        System.out.println(Arrays.equals(new int[]{1} ,new int[]{1})); //true
//
//        System.out.println(Arrays.equals(new int[]{1} ,new int[]{2})); //false
//
//        System.out.println(Arrays.equals(new int[]{1} ,new int[]{1, 2})); //false


//        int[] numbers = {2, 4, 6, 8};
//        System.out.println(Arrays.binarySearch(numbers, 2)); //0
//        System.out.println(Arrays.binarySearch(numbers, 4)); //1
//        System.out.println(Arrays.binarySearch(numbers, 1)); //-1
//        System.out.println(Arrays.binarySearch(numbers, 3)); //-1 -1
//        System.out.println(Arrays.binarySearch(numbers, 9)); //-5
//
//        int[] others = new int[] {3, 2, 1};
//        System.out.println(Arrays.binarySearch(others, 2));
//        System.out.println(Arrays.binarySearch(others, 3));

//        int[] numbers = {6, 9, 1};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        int[] numbers = new int[3];
//
//        int[] more = new int[] {1, 2, 3};
//
//        int[] others = {1, 2, 3};
//
//        int[] ids, types;


//        String[] bugs = {"a","b", "c"};
//
//        String[] alias = bugs;
//
//        String[] others = {"a", "b", "c"};
//
//        System.out.println(bugs.equals(others));
//
//        System.out.println(bugs.equals(alias));
//
//        System.out.println(bugs.toString());
//
//        System.out.println(Arrays.toString(bugs));


    }
}
