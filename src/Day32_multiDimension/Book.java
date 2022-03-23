package Day32_multiDimension;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        /*
        flow : how many chapters is there :
        make a book with that many chapter
        write a chapters one at a time,,,,,break up each chapter by sentences
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters is there");
        String [] []  book = new String [input.nextInt()] [] ;
        input.nextLine();

        for (int i = 0; i <book.length; i++) {
            System.out.println("Enter the chapters " + (i+1));
         String chapter= input.nextLine();
         String [] sentences = chapter.split("!"); // breaking up by the dot.
         book[i] = sentences;

        }
        System.out.println(Arrays.deepToString(book));
        /*
        Today was multi array day. Tomorrow we will start methods. We will start with void.
                Enter the chapters 2
        Arrays are fun. Loops are also fun.
        Enter the chapters 3
        James Bond is back.

*/


    }

}
