package day13_if_statements3;

import java.io.SyncFailedException;
import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
            /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at at 50%
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the level please: ");
        int oxygenLevel = scan.nextInt();
//        String message = scan.nextLine();


//        int oxygenLevel = 100;


//
//        if (oxygenLevel>90 && oxygenLevel<200){
//            System.out.println("Your tank is full");
//        }else if (oxygenLevel>80 ){ // else if ( oxygenlevel >80 && oxygenlevel <90)
//            System.out.println("Still okay");
//        }else if (oxygenLevel>70 ){
//            System.out.println("Don't go too far");
//        }else if (oxygenLevel>60 ){
//            System.out.println("Start to head back");
//        }else if (oxygenLevel>50 && oxygenLevel <=60){
//            System.out.println("Be careful now you at 50%");
//        }else if(oxygenLevel>=200 ) {
//            System.out.println("Dangerous !");
//        }else if (oxygenLevel <=50){
//            System.out.println(" Very Very Dead zone");
//        }
//

        /////////////////////////////////// Another way of Printing ...........///////////////


//        Scanner scan = new Scanner(System.in);
//        System.out.println("\nEnter the level please: ");
//        int oxygenLevel = scan.nextInt();
        String message = scan.nextLine();

        if (oxygenLevel>90 && oxygenLevel<200){
            message= "Your tank is full";
        }else if (oxygenLevel>80 ){ // else if ( oxygenlevel >80 && oxygenlevel <90)
           message= "Still okay";
        }else if (oxygenLevel>70 ){
           message= "Don't go too far";
        }else if (oxygenLevel>60 ){
            message = "Start to head back";
        }else if (oxygenLevel>50 && oxygenLevel <=60){
            message= "Be careful now you at 50%";
        }else if(oxygenLevel>=200 ) {
            message= "Dangerous !";
        }else if (oxygenLevel <=50){
            message= " Very Very Dead zone";
        }
        System.out.println("\t"+ message);

    }
}
