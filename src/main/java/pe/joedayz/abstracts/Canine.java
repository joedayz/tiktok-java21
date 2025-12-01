package pe.joedayz.abstracts;




public abstract  class Canine {

    public abstract String getSound();
}

class ZooMain {
    public static void main(String[] args) {
        Canine c = new Wolf();
        System.out.println(c.getSound());
    }
}

class Wolf extends Canine {
    @Override
    public String getSound() {
        return "Woffff";
    }
}

class Fox extends Canine {

    @Override
    public String getSound() {
        return "";
    }
}

class Coyote extends Canine {

    @Override
    public String getSound() {
        return "";
    }
}










