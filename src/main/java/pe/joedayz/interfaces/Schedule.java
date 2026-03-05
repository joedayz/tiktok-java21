package pe.joedayz.interfaces;

public interface Schedule {
    default void wakeUp(){
        checkTime(7);
        haveBreakfast();
    }

    private void haveBreakfast(){
        checkTime(9);
    }

    static void workOut(){
        checkTime(18);
    }

    private static void checkTime(int hour){
        if(hour>17){
            System.out.println("It's too late");
        }else{
            System.out.println("It's too early");
        }
    }


}
