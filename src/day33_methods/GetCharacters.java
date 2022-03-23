package day33_methods;

public class GetCharacters {
    /*
    make a method that prints all the letters from A-Z
    make a method that prints all the letters from a-z
    make a method that prints all the letters from Z-A
    make a method that prints all the letters from z-a
    make a method that prints all the letters from 0-9
     */

    public static void lettersFromAZUpper() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    public static void lettersFromazLower() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
    public static void lettersFromZAUpper() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
    public static void lettersFromzaLower() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
    public static void print0TopNumbers() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");


        }

    }
}

