package pe.joedayz;

public class MantaRay {

    private  String name = "Joe";

    public static void first(){

    }

    public static void second(){

    }
    public  void third(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
        //third();
        var ray = new  MantaRay();
        ray.third();
    }
}
