package pe.joedayz.records;

public record Crane(int numberEggs, String name) {
}

record Otro(){}

class MainRecords{

    public static void main(String[] args) {
        var mom = new Crane(1, "Mom");

        System.out.println(mom);


        var copy = new Crane(1, "Mom");
        System.out.println(copy);

        System.out.println(mom.equals(copy));

        System.out.println(mom.hashCode());

        System.out.println(copy.hashCode());

    }
}