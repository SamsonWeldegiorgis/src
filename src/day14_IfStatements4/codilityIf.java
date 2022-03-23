package day14_IfStatements4;

import java.util.Scanner;

public class codilityIf {


              public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.println("\nplease write your number");
                int number = input.nextInt();
                String result = " ";
                boolean inValid=true;

                if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                    result += "\n\tCodility";
                    result += "\n\tTest";
                    result += "\n\tCoders";
                } else if (number % 2 == 0 && number % 3 == 0) {
                    result += "\n\tCodility";
                    result += "\n\tTest";
                } else if (number % 3 == 0 && number % 5 == 0) {
                    result += "\n\tTest";
                    result += "\n\tCoders";
                } else if (number % 2 == 0 && number % 5 == 0) {
                    result += "\n\tCodility";
                    result += "\n\tCoders";
                }else {
                    System.out.println("Invalid number: choose 2,3,& 5");
                    inValid=false;
                }
                if (inValid){
                    System.out.println("Result: " + result);
                }
            }}






