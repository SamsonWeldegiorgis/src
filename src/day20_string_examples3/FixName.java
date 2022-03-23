package day20_string_examples3;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        first name
        last name

        fix to print proper name:
        capital first letter the rest lower, no extra space
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");  // james
        String firstName = input.nextLine();     //      01234
        System.out.println("Enter your last name");
        String lastName = input.nextLine();

        firstName= firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst= firstName.substring(0,1).toUpperCase();
                        // ( " " + firstname.charAt()).method >> this will give you
                            // the 1st char but as a char type

        fixedFirst+=firstName.substring(1); // James
       String fixedLast = lastName.substring(0,1).toUpperCase() + lastName.substring(1);


        System.out.println( fixedFirst+ " " + fixedLast);


    }
}
