package pe.joedayz.interfaces;

public interface Herbivore {

    public int eatPlants(int plantsLeft);
}

interface Omnivore {
    public int eatPlants(int foodRemaining);
}

class Bear implements Herbivore, Omnivore{

    @Override
    public int eatPlants(int plantsLeft) {
        System.out.println("Comiendo plantas");
        return plantsLeft - 1;
    }
}