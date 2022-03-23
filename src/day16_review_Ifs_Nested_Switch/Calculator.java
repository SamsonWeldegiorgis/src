package day16_review_Ifs_Nested_Switch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
          declare and assign 2 number variables
    declare and assign a char variable for an operator

    create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
        * : multiply num1 and num2
        / : divide num1 and num2
        any other char: "invalid operator"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number one");
        double numOne = scan.nextDouble();
        System.out.println("Pick operators : + - * / % ");
        String operator = scan.next();
        System.out.println("Enter number two");
        double numTwo = scan.nextDouble();


        double result=0;
        boolean validCalculation = true;

        switch (operator){
            case "+":
            case "plus":
                result=numOne+numTwo;
                break;
            case "-":
                result=numOne-numTwo;
                break;
            case "*":
            case "x":
                result=numOne*numTwo;
                break;
            case "/":
                if (numTwo!=0){
                result=numOne/numTwo;
                }else {
                    System.out.println("Can not divide by 0");
                    validCalculation=false;
                }
                break;
            case "%":
                if ( numTwo !=0) {
                    result = numOne % numTwo;
                } else {
                    System.out.println("Can not take remainder of 0");
                    validCalculation=false;
                }
                break;
            default:
                System.out.println("Invalid");
                validCalculation=false;

        }
        if (validCalculation) {
          if (result== numOne+numTwo){
            System.out.println("The sum total is "+result);
              System.out.println(numOne+" "+ operator+ " "+numTwo+" = "+result);
        }if (result== numOne-numTwo) {
            System.out.println("The difference is " + result);
                System.out.println(numOne+" "+ operator+ " "+numTwo+" = "+result);
        } if (result== numOne*numTwo){
            System.out.println("The product is "+result);
                System.out.println(numOne+" "+ operator+ " "+numTwo+" = "+result);
        }if (result== numOne/numTwo) {
            System.out.println("The quotient is " + result);
                System.out.println(numOne+" "+ operator+ " "+numTwo+" = "+result);
        }if (result== numOne%numTwo){
            System.out.println("The remainder is "+result);
                System.out.println(numOne+" "+ operator+ " "+numTwo+" = "+result);
}}}}
