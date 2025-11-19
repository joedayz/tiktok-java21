package pe.joedayz.overriding;

public class Beetle {

    private String getSize(){
        return "undefined";
    }
}

class RhinocerosBeetle extends Beetle {
    private int getSize(){
        return 5;
    }
}
