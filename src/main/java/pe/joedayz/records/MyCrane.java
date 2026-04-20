package pe.joedayz.records;

public record MyCrane(int numberEggs, String name) {

    public MyCrane(String firstName, String lastName){
        this(0, firstName + " "
                + lastName);

    }

    public MyCrane(int numberEggs, String firstName,
                   String lastName){
        this(numberEggs+1,
                firstName + " "
                + lastName);

        numberEggs = 10;
        //this.numberEggs = 20;
    }


//    public MyCrane(int numberEggs, String name) {
//        if(numberEggs<0)
//            throw new IllegalArgumentException();
//        this.numberEggs = numberEggs;
//        this.name = name;
//    }

//    public MyCrane{
//        if(numberEggs<0)
//            throw new IllegalArgumentException();
//        name = name.toUpperCase();
//
//        if(name==null || name.length()<1))
//            throw new IllegalArgumentException();
//
//        name = name.substring(0,1).toUpperCase()
//                + name.substring(1)
//                .toLowerCase();
//    }

//    YA NO SE VE
}

