package day19_stringExamples2;

import day07_uniry_operators.SalaryCalculator;

import java.util.Locale;
import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        /*
        create a class UserAndPass
ask the user to enter a username and password.
 Check if they are valid based on the following requirements:

- The password cannot be less than 5 characters
	If it is less print: "Password cannot be less than 5 characters"
	If it is more than or equal to 5 print: "Valid password"

- Also, the password should not contain the username
	If the password has the username in it print: "Invalid password, username should not be in it"
	and in that case change the password to have the value: "password"

Print the information in the end
         */


        Scanner input = new Scanner(System.in);
        System.out.println("\nPut username pls");
        String userName = input.nextLine();
        System.out.println("Put the password");
        String passWord = input.nextLine().toLowerCase();
        boolean isValid = true;
        String message = "";

        if (passWord.length() >=5  && !passWord.contains(userName)){
             message="Valid Password";
        } else if (passWord.length()<5) {
            message="Make user more than 5 characters";
        } else {
            if (passWord.contains(userName) )
                message = "Can not have same type of pass to user";
            }if (isValid)
        System.out.println(message);

    }}
