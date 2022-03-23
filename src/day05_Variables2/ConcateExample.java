package day05_Variables2;

public class ConcateExample {
    public static void main(String[] args) {

        System.out.println(5+4);
        System.out.println(5+4+ " Hello"); // left to right don't make any changes the output ex: 9 Hello
        System.out.println("Hello : " + 5+4); // right to left CHANGES unexpectedly the output Hello : 54

                        // int + int = int
                        // 9(int) + " Hello "String = String

    }
}
