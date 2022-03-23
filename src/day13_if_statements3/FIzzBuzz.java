package day13_if_statements3;

import java.util.Scanner;

public class FIzzBuzz {
    public static void main(String[] args) {
        /*
        You will have a number :
            Print result : Fizz, Buzz, or FizzBuzz
            if number is divisible by 3 >> get Fizz
            if number is divisible by 5 >> get Buzz
            if nubmer is divisible by both 3 & 5 >> get FizzBuzz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int number2= sc.nextInt();


//        if ( number % 3==0 && number % 5 ==0 ) {   // n % 15 == 0
//            System.out.println("BuzzFizz");
//        }else if(number % 3==0) {      // 3 , 6 , 15 , 18
//            System.out.println("Fizz");
//        } else if (number % 5==0 ){   // 10 , 20, 25 ,55,
//            System.out.println("Buzz");
//        }else {                         // Non divisible
//            System.out.println(number+ " is not Divisible to 3 and 5");
//        }
//    }
//
//       int number2 =  (number % 3 == 0 && number % 5 == 0) ? "BuzzFizz" : (number % 3==0) ?  "Fizz"
//               : (number % 5==0 )? "Buzz" : "Is not";
    }
}
