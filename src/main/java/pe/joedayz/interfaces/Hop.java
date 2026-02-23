package pe.joedayz.interfaces;

public interface Hop {
    static int getJumpHeight(){
        return 10;
    }

}

class Skip implements Hop{

    public int skip(){
        return Hop.getJumpHeight();
    }
}

class Bunny implements Hop{
    public void printDetails(){
        System.out.println(Hop.getJumpHeight());
    }

}