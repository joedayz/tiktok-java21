package pe.joedayz.interfaces;

public interface Walk {

    default int getSpeed(){
        return 10;
    }
}


interface Run{

    default int getSpeed(){
        return 20;
    }
}

class Cat implements Walk, Run{


    @Override
    public int getSpeed() {
        return 50;
    }
}