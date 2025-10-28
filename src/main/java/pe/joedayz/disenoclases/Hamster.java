package pe.joedayz.disenoclases;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Hamster(int weight) {

       this("brown", weight);
        System.out.println("antes");
    }

    public static void main(String[] args) {
        new Hamster(10);
    }
}
