package pe.joedayz.overriding;

public class Marsupial {
    protected double getAverageWeight(){
        return 50;
    }
    protected double getAverageWeight(int num){
        return num;
    }
}

class Kangaroo extends Marsupial{
    protected double getAverageWeight(){
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Marsupial()
                .getAverageWeight());
        System.out.println(new Kangaroo()
                .getAverageWeight());
    }
}