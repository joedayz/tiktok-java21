package pe.joedayz;

public class Sobrecarga {

    public void fly(int numMiles){
        System.out.println("Sobrecarga fly en int");
    }
    public void fly(short numFeet){
        System.out.println("Sobrecarga fly en short");
    }
    public boolean fly() { return false;}
    void fly(int numMiles, short numFeet){}
    public void fly(short numFeet, int numMiles) throws Exception{}


    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();
        sobrecarga.fly((short)1);
    }
}
