package pe.joedayz.constructores;

public class MyAnimal {
    private int age;
    private String name;

    public MyAnimal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public MyAnimal(int age) {
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends MyAnimal {

    public Gorilla(int age) {
        super(age, "Gorilla");
    }

    public Gorilla (){
        super(4);
    }
}
