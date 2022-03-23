package day16_review_Ifs_Nested_Switch;

import java.util.Scanner;

public class RetakeIfStatment {
    public static void main(String[] args) {
            /*


    declare and assign a grade variable
    declare and assign an attempt number

    Doing a retake for the assignment will reduce the grade by a percentage
    based on the number of attempts taken:

        If its the first attempt -> subtract 10%
        If its the second attempt -> subtract 20%
        If its the third attempt -> subtract 35%

     */

//        Scanner in = new Scanner(System.in);
//        System.out.println("What was the grade");
//        int grade = in.nextInt();
//        System.out.println("Which attempt number is it");
//        int attempt = in.nextInt();

//        if (attempt==1) {
//            System.out.println(grade-(grade*0.1));
//
//        } else if (attempt==2){
//            System.out.println(grade-(grade*0.2));
//
//        }else if (attempt ==3){
//            System.out.println(grade-(grade*0.35));
//        }else {
//            System.out.println("Not valid attempt number");



        //////////////another appraoch /////////////

        Scanner in = new Scanner(System.in);
        System.out.println("What was the grade");
        int grade = in.nextInt();
        System.out.println("Which attempt number is it");
        int attempt = in.nextInt();
        boolean validAttempts = attempt < 4 && attempt > 0 ;  // we can use true or false also
        boolean vali = true ;


        if (attempt==1) {       // deduct 10%
            grade= grade-(int)(grade*0.1);

        } else if (attempt==2){  // deduct 20%
           grade -= grade*0.2;

        }else if (attempt ==3){  // deduct 35%
           grade *= 0.65;     // this is same as grade-(grade*0.35)
        }else {
            System.out.println("Not valid attempt number");
            vali= false;
            // if y do it by assigning true by default,
            // then here u would use validAtempt = false


        }                                       // (  nested is = if inside if   )
        if (vali)
         System.out.println("Your current grade is: "+grade);

    }
}

