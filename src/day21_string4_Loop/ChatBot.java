package day21_string4_Loop;

import java.util.Locale;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        /*


         */

        Scanner input = new Scanner(System.in);

        boolean keepTalking = true;

        while(keepTalking){
            System.out.println("Enter the message");
            String msg = input.nextLine().toLowerCase();

            switch (msg){
                case "hello":
                    System.out.println("how are you");
                    break;
                case "good morning":
                    System.out.println("Good morning ");
                    break;
                case "bye":
                    System.out.println("No don't leave");
                    keepTalking=false;
                default:
                    System.out.println("I didn't understand ");


                  }
        }

    }
}
