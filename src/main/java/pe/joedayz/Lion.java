package pe.joedayz;

class Animal{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Lion {

    int hunger;


    public String zoo(){
        String name = "Harry";
        var size = 10;
        boolean wet;

        if(size>100) size++;
        name.substring(0);
        wet = true;

        return name;
    }




    public void zooCheck(boolean isWeekend){
        final int rest;

        if(isWeekend)
            rest=5;
        else rest=20;
        System.out.println(rest);

        final var gira = new Animal();
        final int[] friends = new int[5];

        friends[2] = 5;
        gira.setName("Pig");

        //friends = null;

        //gira = new Animal();

        //rest = 10;
    }

    public int feed(){
        int snack = 10;
        if(snack>4) {
            long dinner = snack++;
            hunger--;
        }
        return snack;

    }
}
