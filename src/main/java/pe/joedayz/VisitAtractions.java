package pe.joedayz;

public class VisitAtractions {

    public static void walk1(int... steps){
        int[] step2 = steps;
        System.out.println(step2.length);
        System.out.println(steps[1]);

    }

    public static void walk2(int start,
                             int... steps){}

    //public void wall3(int... steps, int start){}

    public static void main(String... args) {
        int[] data = new int[]{1, 2, 3};
        walk1(data);

        walk1(1, 2, 3);
        walk1();

        walk2(1);
        walk2(1, 1);
        walk2(1, 2, 3);
        walk2(1, new int[]{4, 5, 6});
        walk2(1, null);
    }

}
