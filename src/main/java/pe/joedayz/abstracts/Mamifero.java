package pe.joedayz.abstracts;

public abstract class Mamifero {
    abstract CharSequence crew();

    public Mamifero() {
        System.out.println(crew());
    }
}

class Platypus extends Mamifero{

    @Override
    CharSequence crew() {
        return "Yummy";
    }

    public static void main(String[] args) {
        new Platypus();
    }
}