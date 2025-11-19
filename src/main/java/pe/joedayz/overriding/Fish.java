package pe.joedayz.overriding;

public class Fish {
    public void swim(){}
}

class Shark extends Fish{
    @Override
    public void swim(){}

//    @Override
//    public void swim(int speed){}
}
