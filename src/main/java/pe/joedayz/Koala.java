package pe.joedayz;

public class Koala {

    public static int count=2;

    public static void main(String[] args) {
        System.out.println(Koala.count);
    }
}

class KoalaTester{

    public static void main(String[] args) {
        Koala.main(new String[0]);
    }
}