package pe.joedayz.sealing;

public abstract sealed class Fish
        permits Trout, Bass {
}

final class Trout extends Fish{}
final class Bass extends Fish{}

class MainTest {

    public static void main(String[] args) {

        Fish fish = new Trout();

        switch (fish){

            case Trout t ->
                    System.out.println("Trout");
            case Bass b ->
                    System.out.println("Bass");

        }
    }
}
