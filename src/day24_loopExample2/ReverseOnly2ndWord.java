package day24_loopExample2;

import java.util.Scanner;

public class ReverseOnly2ndWord {
    public static void main(String[] args) {
                /*

Given a String with three words separated by spaces.
Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
I evol java

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 words:");
        String str = input.nextLine().trim();         // I love you

        int firstSpace = str.indexOf(" ");  // this " " is for word not char
        int lastSpace = str.lastIndexOf(" ");
        //    str.indexOf(" ",firstSpace + 1)

        String middleWord= str.substring(firstSpace+1,lastSpace);  // love
        String reverse = "";

        for (int i = middleWord.length() -1 ; i>=0 ; i--){
            reverse+=middleWord.charAt(i);

        }
        System.out.println(str.substring(0,firstSpace+1)+ reverse +str.substring(lastSpace));// I evol you
        //  str = str.replaceFirst((middleWord,reverse);
        //  System.out.println(str);
    }
}
