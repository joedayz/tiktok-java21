package pe.joedayz.enums;

public enum Season {

    WINTER, SPRING, SUMMER, FALL
}

//enum ExtendedSeason extends Season{
//
//}

class Main{
    public static void main(String[] args) {

        for (var season : Season.values()) {
            System.out.println(season.name() +
                    " " + season.ordinal());
        }


        Season s2 = Season.valueOf("SUMMER");

//        if(Season.SUMMER == 2){
//
//        }

        var s = Season.WINTER;
        System.out.println(Season.SUMMER);

        System.out.println(s == Season.WINTER);
        System.out.println(s.equals(Season.WINTER));
    }
}