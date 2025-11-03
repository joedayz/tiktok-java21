package pe.joedayz.instanciacion;

public class Animal {

    static{
        System.out.print("A");
    }
}

class Hippo extends Animal {
    public static void main(String[] args) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }

    static  {
        System.out.print("B");
    }
}

class HippoFriend{
    public static void main(String[] args) {
        System.out.print("C");
        new Hippo();
    }
}
















