package day19_stringExamples2;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence ");
        String str = input.nextLine();

        System.out.println("First char: " + str.charAt(0));
        System.out.println("Last char: "+ str.charAt(str.length()-1));
        System.out.println("Upper everything: "+ str.toUpperCase());
        System.out.println("Upper everything: "+ str.toLowerCase());
        System.out.println("Upper everything: "+ str.length());





    }
}
