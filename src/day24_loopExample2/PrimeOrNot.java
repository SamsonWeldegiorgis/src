package day24_loopExample2;

import java.io.SyncFailedException;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        /*
Give a number determine if it is a prime number.
A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:	11    Output:  prime
	Input:	10  	Output: not prime

*/

//        Scanner in = new Scanner(System.in);
//        int num2 = 10;
//        int determine = 0;
//
//        for (int i=0 ; i< 10 ; i++){
//            System.out.println("Enter a number");
//             num2 =in.nextInt();
//            if (num2 % 2 ==0){
//                System.out.println("Not prime ");
//            }else {
//                System.out.println("Prime");
//            }
//        }

        ///////////////////////////Correction or better way /////////////////////////////////////////

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = input.nextInt();
//
//        boolean isPrime = true;  // or boolean isPrime = number >=2
//
//        for (int i=2; i < number ; i++){   // this loop chesk if our number is eveldkkkkkkkkfffffffffffff
//
//            if (number % i ==0) {
//                isPrime = false;
//                break;
//            }
//            }
//          if (isPrime ) {
//              System.out.println(number + ": is Prime ");
//
//        }else {
//              System.out.println(number + ": is not prime");
//          }


          Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        boolean isPrime1= true;

        for (int i=2; i<num; i++){
            if( num % i==0){
                isPrime1=false;
            }
        }
            if(isPrime1){
                System.out.println(num + ": Is prime");
            }else{
                System.out.println(num + " is NOT prime");

    }}
}
