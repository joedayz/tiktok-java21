package pe.joedayz.abstracts;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public final class Animal {

    private final ArrayList<String> favoriteFoods;

    public Animal(ArrayList<String> favoriteFoods) {
        this.favoriteFoods =
                new ArrayList<>(favoriteFoods);
    }


    public ArrayList<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public static void main(String[] args) {
        var favoriteFoods = new ArrayList<String>();
        favoriteFoods.add("Apples");

        var zebra = new Animal(favoriteFoods);
        System.out.println(zebra.
                getFavoriteFoods());

        favoriteFoods.clear();
        favoriteFoods.add("Chocoloate");

        System.out.println(zebra.
                getFavoriteFoods());
    }

}








