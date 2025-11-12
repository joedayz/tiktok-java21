package pe.joedayz.overriding;

public class Camel {

    protected int getNumberOfHumps(){
        return 1;
    }
}

class BactrianCamel extends Camel{
    public int getNumberOfHumps(){
        return 2;
    }
}

class Rider{
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.println(c.getNumberOfHumps());
    }
}