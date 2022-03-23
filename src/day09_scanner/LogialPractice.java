package day09_scanner;

public class LogialPractice {
    public static void main(String[] args) {

        // a number  between 5 and 10

            int n = 6;

        System.out.println(n>5); // True
        System.out.println(n<10); // True

        System.out.println(n> 5 && n <10); // True


        int n2 = 2;

        System.out.println(n2>5); // True
        System.out.println(n2<10); // True

        System.out.println(n2> 5 && n2<10); // False
        System.out.println(n2> 5 || n2<10); // True

        System.out.println(" ------------------------------");

        System.out.println( 4<3 || false); // False
        System.out.println( 4>3 || false); // True
        System.out.println( 3>4 || false); // false


        System.out.println(!false); // True
        System.out.println(!false); // False
        System.out.println(4!=4); // False
    }
}
