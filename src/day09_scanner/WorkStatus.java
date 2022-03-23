package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        /*
        Task
          create Scanner object
          ask the user to enter their first name
          ask the user to enter their last name
          ask the user if they are employed // boolean
          ask the user if they are a student // boolean

         */

//        Scanner input = new Scanner(System.in);
//        Scanner readerText = new Scanner(System.in);
//
//        System.out.println("Put your first name");
//        String firstName = input.nextLine();
//        System.out.println("Put your last name");
//        String lastName = input.nextLine();
//        System.out.println("Put your employeed  ");
//        boolean isEmployeed = input.nextBoolean();
//        System.out.println("Put your student ");
//        boolean isStudent = input.nextBoolean();
//
//        String details = firstName+ " " + lastName + " is Employeed:" + isEmployeed + " and is student: " + isStudent;
//
//        System.out.println( details);
//
//
//        System.out.println(" -------------------------");
//
//        ///////////////////
        Scanner input1 = new Scanner(System.in);
        Scanner readerText1 = new Scanner(System.in);

        System.out.println("Put your first name, last name , employeed and student ");
        String firstName1 = input1.nextLine();
        String lastName1 = input1.nextLine();
        boolean isEmployeed1 = input1.nextBoolean();
        boolean isStudent1 = input1.nextBoolean();

        String details1 = firstName1+ " " + lastName1 + " is Employeed:"
                + isEmployeed1 + " and is a student: " +isStudent1;

        System.out.println( details1);





    }
}
