package day19_stringExamples2;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name  // james
        Ask the user to enter their last name   // bond

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter your first name");
        String firstName = scan.nextLine().toUpperCase();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine().toUpperCase();

        System.out.println("" + firstName.charAt(0)+lastName.charAt(0));

        System.out.println("------------------------");

        System.out.print(firstName.charAt(0));
        System.out.print(lastName.charAt(0));


        System.out.println(" -------------     ------------");

        //////////////correction / another approach

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName1 = input.nextLine();
        System.out.println("Enter your last name");
        String lastName1 = input.nextLine();


        System.out.print((firstName1.toUpperCase().charAt(0)));
        System.out.print(lastName1.toUpperCase().charAt(0));

        System.out.println(" ----------------------------");
        //////////////correction / another approach



        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName2 = in.nextLine();
        System.out.println("Enter your last name");
        String lastName2 = in.nextLine();


        firstName2 = firstName2.toUpperCase();
        lastName2 = lastName2.toUpperCase();

        System.out.println(""+ firstName2.charAt(0) + lastName2.charAt(0));

        char firstLetter = firstName2.toUpperCase().charAt(0);
        char lastLetter = lastName2.toUpperCase().charAt(0);


        System.out.print(firstLetter);
        System.out.print(lastLetter);


           }
}
