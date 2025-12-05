package pe.joedayz.abstracts;

public abstract class Mammal {

    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class Rinho extends Mammal{
    void showHorn(){};
}

class BlackRinho extends Rinho{

    @Override
    void eatLeaf() {

    }
}