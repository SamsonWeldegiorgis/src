package day07_uniry_operators;

public class IncrementExample {

    public static void main ( String[]args ){

        int x =  5;
        System.out.println("\nx:" +x ); // 5

        x++; // post increment
        System.out.println("x++: "+x); // 5 > 6


        x=x+1;
        System.out.println("x+1:"+ x); // 7


        x++;        // 7 > 8
        System.out.println("x++1:"+ (x+1));  // 9
        System.out.println("-----------------------");
        System.out.println("x+2 :" +  (x++));  // 8 > 9

        System.out.println(x); // 9

        ++x ; // pre increment  // 10
        System.out.println("++x:" + x); // 10

        // pre increment
        System.out.println( ++x); // 11 keep incrementing

        // post increment
        System.out.println( x++); // 11>12 // stopped incrementing, it shows the before status

        System.out.println(x); // 12 // current status of x

        System.out.println("============");

        System.out.println( x+1); // 13   .....x=12

        // post increment
        System.out.println( x++); // 12>13 // stopped incrementing, it shows the before status

        System.out.println( x+1); // 14  x = 13

        System.out.println(x); // 13  // current status of x

        // post increment
        System.out.println( x++); // 13>14 // stopped incrementing, it shows the before status
    }
}
