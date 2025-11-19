package pe.joedayz.overriding;

public class Bear {

    public static void eat(){
        System.out.println("Bear is eating");
    }

    public static void sneeze(){
        System.out.println("Bear is sneezing");
    }

    public void hibernate(){
        System.out.println("Bear is Hibernate");
    }

    public static void laugh(){
        System.out.println("Bear is laughing");
    }

}

class SunBear extends Bear{
    public static void sneeze(){
        System.out.println("Sun Bear is sneezing");
    }

//    protected static void laugh(){
//        System.out.println("Bear is laughing");
//    }
//    public static void hibernate(){
//        System.out.println("Bear is Hibernate");
//    }
}





class Panda extends Bear{

    public static void eat(){
        System.out.println("Bear is eating");
    }
}
