package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is today ?");
        String day = input.nextLine();
        System.out.println("Enter your first name:");
        String firstName = input.next(); // takes only one word
        System.out.println("Enter your last name:");
        String lastName = input.next(); // takes only one word

        input.nextLine(); ///// the enter input from the line above is absorbed here/////.

        System.out.println("what is your address:");
        String address= input.nextLine();

        System.out.println("\nFull name: " + firstName+ " " + lastName); // takes only one word
        System.out.println("Today is :" + day);
        System.out.println("Your address is :" + address);

    }
}
