package pe.jeftoken;

import pe.joedayz.ModificadoresAcceso;

import java.math.BigDecimal;

public abstract class Inicio extends ModificadoresAcceso{

    private String name;
    protected boolean status;
    public BigDecimal price;

    public abstract void kin();

    final public  void play() {

    }

    static public  void main(String[] args) {
        ModificadoresAcceso mod = new ModificadoresAcceso();
        //mod.bim();
       // mod.zum();

        //Inicio ini = new Inicio();
        //ini.zum();
    }
}
