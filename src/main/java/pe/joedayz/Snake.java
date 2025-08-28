package pe.joedayz;

public class Snake {
    public static long hiss=2;

    public static void main(String[] args) {


        Snake s =  new Snake();
        System.out.println(s.hiss);

        s = null;

        System.out.println(s.hiss);

        Snake.hiss = 4;
        Snake snake1  = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss);
    }
}
