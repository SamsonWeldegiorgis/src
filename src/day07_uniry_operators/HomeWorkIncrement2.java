package day07_uniry_operators;

public class HomeWorkIncrement2 {
    public static void main(String[] args) {


        int h = 5; //
        int p=h;   // h = 5 p = 5

        System.out.println( "h" +h);   // 5
        System.out.println("p:" +p);   // 5
        System.out.println( "h" +h++); // 5
        System.out.println( "h" +p++); // 5
        System.out.println( "h" +h);   // 6
        System.out.println("p:" +p);   // 6


        System.out.println(" =========  k=h+++  ========");
        int k=h++;

        System.out.println( "h" +h);   // 7
        System.out.println("p:" +k);   // (6)
        System.out.println( "h" +h++); // 7
        System.out.println( "k" +k++); // 6
        System.out.println( "h" +h);   // /8
        System.out.println("k:" +k);   // 7

        System.out.println(" =========================");

        int g=++h;

        System.out.println( "h" +h);   // 9
        System.out.println("g:" +g);   // 9
        System.out.println( "h" +h++); // 9
        System.out.println( "g" +g++); // 9
        System.out.println( "h" +h);   // 10
        System.out.println("g:" +g);   // 10

    }
}
