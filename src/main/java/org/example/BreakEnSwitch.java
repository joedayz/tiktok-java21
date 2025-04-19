package org.example;

public class BreakEnSwitch {

    public static void main(String[] args) {
        int month = 5;
//        switch (month) {
//            case 1, 2, 3:
//                System.out.print("Verano-");
//                break;
//            case 4, 5, 6, 7, 8:
//                System.out.print("Invierno-");
//                break;
//            case 9, 10:
//                System.out.print("Primavera-");
//                break;
//            default:
//                System.out.print("Indeterminado");
//        }

        String resultado = switch (month){
            case 1, 2, 3 -> "Verano";
            case 4, 5, 6, 7, 8 -> "Invierno";
            case 9, 10 -> {
                String rpta = "Primavera-";
                yield rpta;
            }
            default -> "Indeterminado";
        };

        System.out.println(resultado);

//        switch (month){
//            case 1, 2, 3 -> System.out.println("Mesmo");
//            case 2 -> System.out.println("Mesmo");
//        }
        int measurement = 10;

        int size = switch (measurement){
            case 5 -> 1;
            case 10 -> (short)2;
            default -> 3;
            case 20 -> 4;
           // case 50 -> "5";
        };

        String type = "abc";
        Integer rpta = switch (type)
        {
          case "verano" -> 1;
          case "invierno" -> 2;
          default -> 5;
        };










































    }
}
