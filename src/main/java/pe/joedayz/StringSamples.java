package pe.joedayz;


import java.sql.SQLOutput;

public class StringSamples {


    public static void main(String[] args) {

//        String name = "perusalen";
//
//        System.out.println(name.length());
//
//        System.out.println(name.charAt(8));


//        var s = "Weâ€™re donde feeding the animals";
//        System.out.println(s.charAt(0) + " " +
//                s.codePointAt(0));
//
//        System.out.println(s.charAt(2) +" "+
//                s.codePointAt(2));
//
//        System.out.println(s.codePointBefore(3));
//
//        System.out.println(s.codePointCount(0,4));


//        var s = "perusalen";
//        System.out.println(s.substring(3));
//
//        System.out.println(s.substring(3, 7));
//
//        System.out.println(s.substring(s.indexOf('u')));

//        System.out.println(s.substring(3, 10));


//        var name = "perusalen";
//
//        System.out.println(name.indexOf('p'));
//        System.out.println(name.indexOf("ru"));
//
//        System.out.println(name.indexOf('e', 4));
//
//        System.out.println(name.indexOf('n', 2, 9));
//
//
//        System.out.println(name.indexOf("ru", 2, 9));
//
//
//        System.out.println(name.toUpperCase());
//        System.out.println("JoeDayz".toLowerCase());


//        System.out.println("abc".equals("ABC"));
//        System.out.println("ABC".equals("ABC"));
//
//        System.out.println("ABC".equalsIgnoreCase("abc"));

//        System.out.println("abc".startsWith("a"));
//        System.out.println("abc".startsWith("b", 1));
//
//        System.out.println("abc".startsWith("b", 2));
//
//        System.out.println("abc".endsWith("c"));
//
//        System.out.println("abc".contains("b"));
//
//        System.out.println("abc".contains("B"));

//        System.out.println("abcabc"
//                .replace("a", "A"));
//        System.out.println("abcabc"
//                .replace('a', 'A'));

        String text = "    abc\t  ";
        System.out.println(text.trim().length());

        char ch = '\u2000';

        System.out.println(text.strip().length());
        System.out.println(text.stripLeading().length());
        System.out.println(text.stripTrailing().length());

    }

}
