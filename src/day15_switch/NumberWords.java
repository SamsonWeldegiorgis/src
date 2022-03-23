package day15_switch;

public class NumberWords {
    public static void main(String[] args) {
        /*
        Take a number and print the number as the word version
            1> one
            2> two
         */

        int n = 3;
        String message ="";
        // as if statement

        if (n == 1) {
            message="One";
        } else if (n == 2) {
            message="Two";
        } else if (n == 3) {
            message="Three";
        } else if (n == 4) {
            message="Four";
        } else
            message="Invalid Number";
        System.out.println("\n"+ message);


        //    as switch statement


        switch (n) {  // put the number you wanted

            case 1:   // in if statement : if (n==1) {
                System.out.println("One");
               break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
    }

