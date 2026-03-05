package pe.joedayz.enums;

interface Visitors{
    void printVisitors();
}


public enum SeasonWithVisitors
    implements Visitors{

    WINTER("Low"), SPRING("Medium"),
    SUMMER("High"), FALL("Medium");

    private final String visitors;

    SeasonWithVisitors(String visitors){
        this.visitors = visitors;
    }

    @Override
    public void printVisitors() {
        System.out.println(visitors);
    }
}
