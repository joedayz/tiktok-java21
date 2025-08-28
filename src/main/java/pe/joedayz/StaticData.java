package pe.joedayz;

public class StaticData {
    String name;
    static String nameOfTallestPenguin;

    public static void main(String[] args) {
        var p1 = new StaticData();
        p1.name = "Joe";

        var p2 = new StaticData();
        p2.name = "Mir";

        p1.nameOfTallestPenguin = "Eli";

        StaticData
                .nameOfTallestPenguin = "Kim";

        System.out.println(p1
                .nameOfTallestPenguin);
    }
}
