package pe.joedayz;

public class OtroAcceso {

    public void zas(int d){
        if(d<=0) {
            return;
        }
        System.out.println("d:"+d);
    }

    String hike(int a){
        if(a<=0) return "abc";
        return "xyz";
    }
    String hike2(int a){
        if(1<2) return "abc";
        return "xyz";
    }

    public static void main(String[] args) {
        ModificadoresAcceso mod = new ModificadoresAcceso();
        mod.bim();

        mod.zum();
    }

    public synchronized void zum(){}

    //native  C++
    //strictfp
}
