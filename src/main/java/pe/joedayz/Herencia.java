package pe.joedayz;

public class Herencia {
}

final class HijoHerencia extends Herencia{

}

class BigCat{
    protected double size;
}

class Jaguar extends BigCat{
    public Jaguar(){
        size = 10.2;
    }
    public void printDetails(){
        System.out.println(size);
    }
}

abstract class AbstractPadre{
    public void play(){}
    public abstract void zoom();
}
class MainClass{
    public static void main(String[] args) {
        //var a = new AbstractPadre();
    }
}
sealed class SealPadre permits HijoSeal1, HijoSeal2{

}
//3 opciones: final, sealed, non-sealed
final class HijoSeal1 extends SealPadre{}

non-sealed class HijoSeal2 extends SealPadre{}

class OtroHijo extends HijoSeal2{

}


//class Nieto extends HijoHerencia{
//
//}
