package day24_loopExample2;

import java.util.Locale;
import java.util.Scanner;

public class FirstLastName {
    public static void main(String[] args) {
        /*

        Given a first name and last name create and return an id using the following format:
        the first letter of the first name as lowercase,
                the first 3 letters of the last name with the first letter
        as uppercase and the rest lowercase,
        the length of the first String multiplied by 2

        first name: john
        last name: smith

        id: jSmi8
                */

        String firstName = "james";
        String lastName = "bond";
        String id ="";

//        for (int i=0 ; i<firstName.length(); i++);
//        System.out.print(firstName.charAt(0));
//        System.out.print(lastName.substring(0,1).toUpperCase());
//        System.out.print(lastName.charAt(1));
//        System.out.print(lastName.charAt(2));
//        System.out.println(firstName.length()*2);


        ////////////////corrections - Better - Solutions ///////////////////////////////////////////

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first name");
        String  firstName1 = input.nextLine().toLowerCase().trim();
        System.out.println("Enter your last name");
        String  lastName1 = input.nextLine().toLowerCase().trim();

        String id1= firstName.substring(0,1);
        id1+= lastName1.substring(0,1).toUpperCase()+lastName1.substring(1,3);
        id1+=firstName1.length()*2;

        System.out.println(id1);








    }
}
