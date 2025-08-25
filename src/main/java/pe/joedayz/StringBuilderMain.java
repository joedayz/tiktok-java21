package pe.joedayz;

import java.sql.SQLOutput;

public class StringBuilderMain {

    public static void main(String[] args) {

        var sb = new StringBuilder("perusalen");
        sb.reverse();
        System.out.println(sb);

        var sb2 = new StringBuilder("perusalen");
        String s = sb2.toString();

//        var builder = new StringBuilder("perusalen");
//        builder.replace(3, 6, "joe");
//        System.out.println(builder);

//        var sb = new StringBuilder("perusalen");
//        sb.delete(1, 2000);
//        //sb.deleteCharAt(5);
//        System.out.println(sb);


//        var sb = new StringBuilder("perusalen");
//        sb.insert(7, "-");
//        sb.insert(0, '-');
//        sb.insert(4, "-");
//        System.out.println(sb);


//        var sb = new StringBuilder()
//                .appendCodePoint(87).append(',')
//                .append((char)87).append(',')
//                .append(87).append(',')
//                .appendCodePoint(5000);
//        System.out.println(sb);

//
//        var sb = new StringBuilder().append(1)
//                .append('c');
//        sb.append("-").append(true);
//        System.out.println(sb);


//         var sb = new StringBuilder("perusalen");
//         String sub = sb.substring(sb.indexOf("u"),
//            sb.indexOf("al"));
//        System.out.println("sub= " + sub);
//        int len = sb.length();
//        char ch = sb.charAt(7);
//        System.out.println(sub + " " + len + " " + ch);



//        StringBuilder sb = new StringBuilder();
//        for (char c = 'a'; c <= 'z'; c++) {
//            sb.append(c);
//        }
//        System.out.println(sb);

//        StringBuilder a = new StringBuilder("abc");
//        StringBuilder b = a.append("def");
//        b = b.append("ghi");
//        System.out.println("a= " + a);
//        System.out.println("b= " + b);
//
//        StringBuilder c = new StringBuilder();
//        StringBuilder d = new StringBuilder("joedayz");
//        StringBuilder e = new StringBuilder(10);


//        String alpha = "";
//        for (char c = 'a'; c <= 'z'; c++) {
//            alpha += c;
//        }
//        System.out.println(alpha);
    }
}
