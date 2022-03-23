package day09_scanner;

public class GoforWalk {
    public static void main(String[] args) {
        /* we want to go for a walk
            we will go for a walk if it is not raining and the weather > 70
            There is no need to check the weather if it is raining
         */

        boolean isRaining = true;
        int temperature = 80;

        System.out.println( !isRaining && temperature >70); // false
        System.out.println( isRaining && temperature <70); // false
        System.out.println( isRaining && temperature >70); // true
        System.out.println( isRaining & temperature <70); // false
        System.out.println( !isRaining || temperature <70); // false
        System.out.println( isRaining | temperature <70); // true
        System.out.println( isRaining || temperature <70); // true
        System.out.println( !isRaining && temperature <70); // false


    }
}
