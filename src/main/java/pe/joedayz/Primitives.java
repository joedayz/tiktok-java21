package pe.joedayz;

public class Primitives {

//    public void fly(int i){
//        System.out.print("int");
//    }
    public void fly(long l){
        System.out.print("long");
    }

//    public void fly(Integer i){
//        System.out.println("Integer");
//    }


    public static void main(String[] args) {
        var p = new Primitives();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
       // p.fly(Integer.valueOf(123));
    }
}
