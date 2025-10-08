package pe.joedayz;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class ReferenceTypes {

    public static void print(List<Integer> nums){
        System.out.println("I");
    }
    public static void print(Object o){
        System.out.println("O");
    }

    public static void print(CharSequence c){
        System.out.println("C");
    }

//    public void fly(String s){
//        System.out.println("string");
//    }
//    public void fly(Object o){
//        System.out.println("object");
//    }

    public static void main(String[] args) {
        print("abc");
        print(List.of(3));
        print(LocalDate.of(2025, Month.OCTOBER,
                8));

//        var p = new ReferenceTypes();
//        p.fly("test");
//        System.out.print("-");
//        p.fly(56);
    }
}
