package day15_switch;

import java.util.Scanner;

public class ArmyQualify {
    public static void main(String[] args) {
        /*
        Declare and assign these variables: Citizenship(boolean), resident
(boolean), and has high school diploma (boolean), and age(int). Determine
if the person is qualified to join the army.
- The person must be a citizen or a resident
-> If not print: You must be a citizen or a resident
- Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years
old
- They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the Army

        Appr


         */


        Scanner input = new Scanner(System.in);
        System.out.println("\nAre you a citizen ");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you a resident ");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have diploma  ");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("How old are you : ");
        int age = input.nextInt();


//        if ((isCitizen || isResident) && hasDiploma && (age <= 35 && age >= 18)) {
//            System.out.println("Qualified for the army");  // string = you are qualified for the Army
//
//        } else {
//            if (!isCitizen && !isResident) // ( isCitizen==false ||isResident==false) or !(isCitizen || isResident
//                System.out.println("You must be a citizen or a resident");
//            }
//            if (!hasDiploma) {
//            System.out.println("You must have a high school diploma");
//            }
//            if (age < 18 || age > 35)  // !(age >=18 && age <= 35)
//            System.out.println("Your age must be b/n 18 to 35 years old");
//    }}


        if (isCitizen == true && isResident == true && hasDiploma == true && age >= 18 && age <= 35) {
            System.out.println("Qualifiied to Join ");
        } else {

            if (isCitizen != true) {
                System.out.println("You must be a citizen");

            }
            if (isResident != true) {
                System.out.println("You must be a resident");
            } if (hasDiploma !=true) {
                System.out.println("Your must have diploma ");
            } if (age < 18) {
                System.out.println("Your age must be b/n 18 & 35");
            }
            if (age > 35) {
                System.out.println("Your age must be b/n 18 &35");
            }
        }
    }}



