package pe.joedayz.overriding;

public class Rhino {

    protected CharSequence getName(){
        return "Rhino";
    }

    protected String getColor(){
        return "grey,black,or white";
    }
}

class JavaRihino extends Rhino {
    public String getName(){
        return "Java Rhino";
    }
//    public CharSequence getColor(){
//        return "Brown";
//    }
}
