package day24_loopExample2;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        /*
        count words in a sentence: input: This has multiple words ==> out put 4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine().trim();
        int words = 0;

        for (int i =0; i < str.length(); i++){
            if(str.charAt(i)== ' '){  // str.substring(i,i+1);
                words++;
            }
        }
        System.out.println("Number of words: " + (words+1));


        for ( int i=0; i < str.length(); i++){
            if (str.substring(i, i+1) ==" "){
                words++;
            }
        }
        System.out.println("Number of words: " + (words+1));
    }
}
