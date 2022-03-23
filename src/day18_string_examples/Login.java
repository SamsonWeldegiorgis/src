package day18_string_examples;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
          /*

        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more than 8 characters long

        valid system password: "jamesbond"

        -> if the entered password is matches the system password

     */

        Scanner input =new Scanner(System.in);
        System.out.println("\nPlease user username");
        String userName = input.nextLine();

        userName=userName.toLowerCase();

        System.out.println("Username: "+ userName); // jamesbond

        System.out.println("Usernamelength : "+ userName.length()); // 9

        System.out.println("Please enter a password: ");
        String passWord = input.nextLine();

        if (passWord.length() >= 8 && passWord.equals("jamesbond")) {
            System.out.println("logged in with " + userName);
        } else {
            System.out.println("Put valid password");
        }



    }
}
