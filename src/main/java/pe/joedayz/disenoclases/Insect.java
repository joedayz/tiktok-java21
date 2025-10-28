package pe.joedayz.disenoclases;

public class Insect {

    protected int numberOfLegs = 4;
    String label = "buggy";

}

class Benny extends Insect{
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData(){
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
        //System.out.println(super.age);
        System.out.println(numberOfLegs);
    }

    public static void main(String[] args) {
        new Benny().printData();
    }
}
