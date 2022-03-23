package day05_Variables2;

public class Opeartors {

    public static void main(String[] args) {

        System.out.println("\n:"+20/6.0); // dividing and getting Decimal


        int i=10;
        System.out.println("\n"+ ++i); // increment =  11
        System.out.println("\n"+ --i); // increment =  10 ( 11-1)

        System.out.println("-------------------------------------------");


        System.out.println("\ni=" + i--); // Post Increment
        System.out.println("i="+ i);

        System.out.println("-------------------------------------------");


        int f=100;                            // pre Increment
        System.out.println("\nf="+ f--);
        System.out.println("f=" +f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + --f);
        System.out.println("f=" + f);

        System.out.println("-------------------------------------------");



        int a = 100;
        a+=200; // increases by 300= (  100+200 = 300 )

        System.out.println("\na:"+ a);

        int c = 200;
        c-=50;

        System.out.println( "\nc:" + c); // decreases by  50 = 200-50

        int d = 50;
        d*=4;

        System.out.println("\nd:" + d); // multiplies 50*4 = 200

        int g=90;
        g/=3;

        System.out.println("\ng:" + g); // divides 90/3 = 30

        double z=200;
        z%=3;

        System.out.println("\nz:" + z); // remainder is 2=  200- (3* 200/3) =


        System.out.println("-------------------------------------------");



        boolean result1 = 500 ==500; // true
        boolean  result2 = 50==500; // false
        boolean result3 = 50!=500;  // true
        boolean result4 = 500!=500; // false
        boolean result5 = 100>400;  // false
        boolean result6 = 400>=50;  // true
        boolean result7= 100<=80;   // false


        System.out.println("result1 : " + result1);
        System.out.println("result2: "  + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
        System.out.println("result5 : " + result5);
        System.out.println("result6 : " + result6);
        System.out.println("result7 : " + result7);



        System.out.println("-------------------------------------------");

        // &&
         // // if both are true, it is TRUE

        boolean total1 =10>5 && 10>7;  // true
        boolean total2= 20>15 && 20>25; // false
        boolean total3 = 30 >50 && 30>10;   // false

        System.out.println("Total1 : " + total1);
        System.out.println("Total2 : " + total2);
        System.out.println("Total3 : " + total3);

        System.out.println("-------------------------------------------");

        // Logical OR :
        // if one is False or one is true = the answer is True

        boolean total4= 100 == 200 || 100==300; // false
        boolean total5= 1000>900 || 1000<2000;  // true
        boolean total6= 7<0 ||  7>15;       // false


        System.out.println("Total4:" + total4);
        System.out.println("Total5:" + total5);
        System.out.println("Total6:" + total6);



        System.out.println("-------------------------------------------");

        // Logical NOT :
        // if one is False or one is true = the answer is True

        boolean total7= !true ; // false
        boolean total8= !false;  // true
        boolean total9= 100==200; // false
        boolean total10= !(100==200); // ! false = true

        System.out.println("Total7:" + total7);
        System.out.println("Total8:" + total8);
        System.out.println("Total9:" + total9);
        System.out.println("Total10:" + total10);










    }
}
