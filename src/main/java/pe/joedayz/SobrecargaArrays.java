package pe.joedayz;

public class SobrecargaArrays {
//    public static void walk(int[] ints){
//        System.out.println("ints[]");
//    }
    public static void walk(Integer[] ints){
        System.out.println("Integers[]");
    }
    public static void walk(int... ints){
        System.out.println("ints[]");
    }

    public static void main(String[] args) {
        SobrecargaArrays.walk(new int[]{1,2,3,4,5});

        SobrecargaArrays.walk(1,2, 3);
////
        SobrecargaArrays.walk();
    }
}
