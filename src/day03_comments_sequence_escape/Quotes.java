package day03_comments_sequence_escape;

public class Quotes {
    public static void main(String[] args) {
        /*
          Q: How can you output this :
             I like “ java” programming

         */

        System.out.println( "I like “ java” programming "); // or//

        System.out.println("I like \"java\" programming");

        System.out.println( "\"This is a favourite qoute\"");

        System.out.println( " I live in Lynnwood , WA \\\\");

            // the first backslash is for the sytax of escape character
            // the second backslash is fo rthe backslash character to be output

        System.out.println( " I live in Lynnwood , WA \\\\\\\\"); // prints 4 or half of them


        System.out.println("abc//def");

        System.out.println( "abc\\def");
    }
}
