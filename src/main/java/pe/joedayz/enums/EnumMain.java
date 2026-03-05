package pe.joedayz.enums;

public class EnumMain {

    public static void main(String[] args) {

    }

    String getWeather(Season value){
        return switch (value){
            case WINTER -> "cold";
            case SPRING-> "warm";
            case SUMMER -> "hot";
            case FALL -> "cold";
        };
    }
}
