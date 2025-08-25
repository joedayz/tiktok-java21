package pe.joedayz;

public class VarArgsMain {

    public static void main(String... args) {
            play(new int[]{1, 2, 3});

            play();

            play(1);

            play(1, 2, 3, 4, 5, 6);
    }

    public static  void play(int... s ){

    }
}
