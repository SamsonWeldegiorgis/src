package day28_arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        /*
        All String types
        0 - id ,,,,,1- first name    2 - last name     3- batch number
         */

//        String [] studentOne = {"007","James" , "Bond" , "James" , "7" };
//        System.out.println(Arrays.toString(studentOne)); // 007, James, Bond, 7
////
////        String [] studentTwo = new String[4];
////        System.out.println(Arrays.toString(studentTwo));  // null, null ,null, null
////        studentTwo[0] = "010";
////        studentTwo[1] = "Jamie";
////        studentTwo[2] = "Smith";
////        studentTwo[3] = "26";
////
////        System.out.println(Arrays.toString(studentTwo));  // 010, Jamie ,Smith, 26
////
////        String [] studentThree = new String[4];
////        Scanner input = new Scanner(System.in);
////        System.out.println("Enter your id");
////        studentThree[0]= input.nextLine();
////        System.out.println("Enter your first name");
////        studentThree[1]= input.nextLine();
////        System.out.println("Enter your last name");
////        studentThree[2]= input.nextLine();
////        System.out.println("Enter your batch number");
////        studentThree[3]= input.nextLine();
////
////        System.out.println(Arrays.toString(studentThree));  // 010, Jamie ,Smith, 26
//
//        System.out.println(" ------------------------------");
//
        Scanner input = new Scanner(System.in);
        String [] student = new String[4];
        String [] questions = {"Enter your id", "Enter your 1st name", "Enter your 2nd name", "Enter your bach id"};

        for (int i=0 ; i < 4 ; i++){
            System.out.println(questions[i]); // reading wach element of the question array
            student[i] = input.nextLine();// assigning the Scanner input to our studentFour

        }
        System.out.println(Arrays.toString(student));





    }
}
