package pe.joedayz.interfaces;

public interface IsColdBlooded {

    boolean hasScales();

    default double getTemperature() {
        return 25.0;
    }
}


class Snake implements IsColdBlooded{
    public boolean hasScales(){
        return true;
    }

    public double getTemperature(){
        return 37.0;
    }
}