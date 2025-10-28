package pe.joedayz;

public class GlideExample {

    String glide(int i, int j){
        return "int i , int j";
    }
    String glide(long i, long j){
        return "long i, long j";
    }
    String glide(Integer i, Integer j){
        return "Integer i, Integer j";
    }

    String glide(int... nums){
        return "varargs int";
    }

    public static void main(String[] args) {
        GlideExample glideExample = new GlideExample();
        glideExample.glide(1, 2);
        glideExample.glide(1,2,3);
    }
}
