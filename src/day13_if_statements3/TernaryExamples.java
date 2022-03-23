package day13_if_statements3;

import day02_print_statements.HelloWorld;

public class TernaryExamples {
    public static void main(String[] args) {

//        int a = 150;
////        String evenOrOdd;
//
////
////        if ( a % 2 == 0){
////        evenOrOdd = "Even";
////        }else {
////            evenOrOdd="Odd";
////        }
//
//        String result = a % 2 == 0 ? "Even " : "Odd";
////        System.out.println(evenOrOdd);
//        System.out.println(result);


        ///////////another example //////////////////////////////////////////////

//        int num = 455;
//        String posOrNeg;
//
////           if ( num > 0) {
////               posOrNeg = "Positive ";
////           }  else if ( num<0){
////            posOrNeg = "Negative";
////          }else {
////            posOrNeg="Zero";
////        }
////        System.out.println(posOrNeg);
////
//        String sign = (num >0) ? "positive" : (num <0) ? "negative" : "zero";
//        System.out.println("\nSign is : " + sign);


///////////another example //////////////////////////////////////////////


//
//        int time = 12;  // know lunch time or dinner time
//        double price;
//
//        if (time >= 10 && time <= 15) {  // 15 means 3 pm
//            price = 7.99;
//        } else {
//            price = 10.99;   // dinner time, it costs more
//        }
//
//        String result = (time >= 10 && time <= 15)? "price = 7.99" : "price = 10.99";
//        System.out.println("\n" +result);



        ///////////another example //////////////////////////////////////////////

        String greet = "Hello World";
//
//        if ( greet=="HelloWorld"){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }

        String result = (greet == "HelloWorld")? "True" : "False";
        System.out.println("\nThe result is : "+ result);
    }
}
