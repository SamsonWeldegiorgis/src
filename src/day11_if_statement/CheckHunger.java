package day11_if_statement;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        /*
        Task :
        if the person is hungry ;
            Print : You are Hungry, so I will get some food
                    to eat
        if not Hungry : print, Great , then practice Java
         */

        boolean isHungry= false;

        if ( isHungry== false){
            System.out.println("If you are hungry, " +
                    "\nso I will get you some food to eat");}
            else {System.out.println("You are NOT hungry, Great ! Practice Java !"); }


            ////////////another way /////////////////

        Scanner input= new Scanner(System.in);
        System.out.println(" Are you hungry ? ");
        boolean isHungry1 = input.nextBoolean();


        if ( isHungry1== false){
            System.out.println("If you are hungry, " +
                    "\nso I will get you some food to eat");}
        else {System.out.println("You are NOT hungry, Great ! Practice Java !"); }




    }
}
