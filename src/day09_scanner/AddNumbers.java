package day09_scanner;


import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        /*
         Create Scanner object
            ask the user to enter 3 numbers
            find and print the sum of the numbers
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a first number : ");
        int first = input.nextInt();
        System.out.println("Enter a first number : ");
        int second = input.nextInt();
        System.out.println("Enter a first number : ");
        int third = input.nextInt();

        System.out.println(" The sum total of "+first+ " ,"+second+ " ,and " +third+" is: "+
                (first+second+third));

        System.out.println(" The sum total of "+first+ "+"+second+ "+" +third+"="+
                (first+second+third));



        //////////////////CORRECTIONS ///////////////////

        Scanner input1 = new Scanner(System.in);

        System.out.println("Please enter 3 numbers : Hit once you put: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println(" The sum is = : "+ (num1+num2+num3));

    }
}
