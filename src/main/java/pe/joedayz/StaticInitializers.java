package pe.joedayz;

public class StaticInitializers {

    private static final int
            NUM_SECONDS_PER_MINUTE;
    private static final int
            NUM_MINUTES_PER_HOUR;
    private static final int
        NUM_SECONDS_PER_HOUR;

    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four;

    static{
        one =1 ;
        two =2;
        //three = 7;
        four = 5;
    }


    static{
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static{
        NUM_SECONDS_PER_HOUR =
                NUM_SECONDS_PER_MINUTE
                        * NUM_MINUTES_PER_HOUR;

    }


}
