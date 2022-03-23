package day08_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int b = 10;  // b = 10 -> 11
        b++ ; // post increment , no other code, adds 1

        System.out.println(b); // print the value of b, which is 11

        b--; // post decrement
        System.out.println(b);  // 10  ,,,,,,,,,right away decrese --b >> which is 10
        System.out.println(b++); // 10 .........shows the saved or current saved value 10
        System.out.println(b++);  // 11 ..........shows add of the above 11
        System.out.println(b+2);  // 14 .......... add 2 more of the above 14
        System.out.println(b+2);  // 14 ..........shows add of the above 14
        System.out.println(b+2);  // 14 ..........shows add of the above 14

        System.out.println("\\ Print please");

        short scale = 50;
        long total = (long)scale;

        long total1= 500;
        short scale1 = (short)total1;
    }

}
