package pe.joedayz;

public class FinalEnSwith {

    final int getCookies(){
        return 4;
    }

    void feedAnimal(){
        final int ban = 1;
        int apple2 = 2;
        int numberOfAnim = 3;
        final int cookies = getCookies();
        switch (numberOfAnim) {
            case ban:
            //case apple2: NO COMPILA
            //case getCookies(): NO COMPILA
            //case cookies: NO COMPILA
            case 3 * 5:
        }

        String rpta = switch (apple2) {
            //case "Hola" -> "abc";
            default -> "def";
        };














    }
}
