package pe.joedayz.disenoclases;

public class Flamingo {

    private String color = null;

    public void setColor(String color) {
        this.color = color;

    }
}

class Reptile{
    protected int speed = 10;
}
class Cocodrile extends Reptile{
    protected int speed = 20;

    public int getSpeed() {
        return super.speed;
    }

    public static void main(String[] args) {
        var c = new Cocodrile();
        System.out.println(c.getSpeed());
    }
}