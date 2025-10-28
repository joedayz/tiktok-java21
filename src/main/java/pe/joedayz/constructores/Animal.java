package pe.joedayz.constructores;

public class Animal  extends Object{
     private int age;

    public Animal(int age) {
        super();
        this.age = age;
    }
}

class Zebra extends Animal{
    private int age;
    public Zebra(int age) {
        //System.out.println("abc");
        super(age);
        //super(4);
    }

    public Zebra(){
        this(4);
    }
}


