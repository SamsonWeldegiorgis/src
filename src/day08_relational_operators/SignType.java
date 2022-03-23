package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {

        /*
        Task  :
            Declare and assign a number and I want to know the sign of the number
            if the number is positive, is the number negative, is the number zero
         */

        System.out.println(" Put a number");

        int number = 80;

        boolean positive = number >0 ;
        boolean negative = number <0 ;
        boolean zero  = number == 0 ;


        System.out.println(number+ " is positive:"+ positive);
        System.out.println(number+ " is negative:"+ negative);
        System.out.println(number + " is zero: "+ zero);

        System.out.println(" __________________________________");

        int number1 = -80;

        boolean positive1 = number1 >0 ; // true
        boolean negative1 = number1 <0 ;
        boolean zero1  = number1 == 0 ;


        System.out.println(number1+ " is positive:"+ positive1);
        System.out.println(number1+ " is negative:"+ negative1); // true
        System.out.println(number1 + " is zero: "+ zero1);


    }
}
