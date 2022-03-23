package Quizzes;

public class VariablesDatatypesShortQuiz {
    public static void main(String[] args) {

        System.out.println("--------// NO.# 1-------------");
        // NO.# 1 . Select all primitive data types
                // char
                // double
                // int
                // boolean

        System.out.println("--------// NO.# 2-------------");


        // NO.# 2 Not valid Variable name :
                // long
                // but intNum, _String, Public, $Double are variable names

        System.out.println("--------// NO.# 3-------------");


        // No.# 3

                int students = 50 , teachers ;
                    students = 100;
                // students = 400;
                // students = 1000;

            System.out.println("Students: " + students);//  =  100 ,,,,,b/s students below(100) are
                                            // exact not 50

        System.out.println("--------// NO.# 4-------------");


        // NO.# 4
                int num1= 50;
                int num2= 200;
                   num2=num1;
            System.out.println("num1:"+num1);  // 50,,,,,,for num1 is changed into 50 from 100
            System.out.println("num2:"+num2);   // 50,,,,,,for num2 is changed into 50 from 100


        System.out.println("--------// NO.# 5-------------");

        // NO.# 5

        long a = 30L;
        short b = (short)a;

        System.out.println( "b:"+b);  // 30 ,,,,,,for short is like int gives you full ;;30

        System.out.println("--------// NO.# 6-------------");


        // NO.# 6

       float a11 = 800.459_524f;
       byte b11 = (byte)a;
       double c = b11;


        System.out.println("b11:"+ b11);  // 100 ,,,,,,for BYTE == 100 ,
                                  // LAST DOUBLE= BYTE>>> BYTE  , since b1=c the byte wins

        System.out.println("---------------------");

        float a2 = 100.459_524f;
        double b2 = (byte)a;
        byte c1 =(byte) b2;

        System.out.println("b2:"+b2);  // 100.0 ,,,,,,for DOUBLE is decimal == 100.0
        // LAST BYTE= DOUBLE >> DOUBLE  , since b1=c the DOUBLE wins

        System.out.println("---------------------");

        int scale = 50;
        int move = 20;
           move= scale;

        System.out.println("scale:" +scale);  // 50
        System.out.println("move:"+move);   // 50

        System.out.println("---------------------");


        int scale1 = 50;
        int move1 = 20;
        scale=move;

        System.out.println("scale1: "+scale1);  // 50
        System.out.println("move1:"+move1);   // 20

        System.out.println("---------------------");

        int a6 = 100;
        long b8 = 80;
        short x= (short)b8;


        System.out.println("b8:"+b8);     // 80
        System.out.println("x:"+x);      // 80
        System.out.println("a6:"+a6);     // 100

        int a7 = 100;
        short b9 = (short) a7;
        long x1= b9;


        System.out.println("---------------------");

        System.out.println("b9:"+b9);     // 100
        System.out.println("x1:"+x1);     // 100
        System.out.println("a7:"+a7);     //  100

        System.out.println("--------// NO.# 7-------------");


        // NO. 7

      // The default data type for whole numbers is ______ and   // int
        // the default data type for floating numbers is: ______  // double

            // int and double are default values //


        System.out.println("--------// NO.# 8-------------");


        // NO. 8
//            int i = 100;         // line 1
//            double d = 123;      // line 2
//            float f = 300;       // line 3
//            i=f;  // line 4      // line 4
//            f=i;                  // line 5
//            d=f;                     // line 6
//            f=d;                     // line 7
//            d=i;                     // line 8
//            i=d;                     // line 49

        // fail to compile = line 4, line 7 and line 9


        System.out.println("--------// NO.# 9-------------");



        // NO. 9


        System.out.println("Result A: " +0 + 1);  // Result A = 01
        System.out.println("Result B: " +(1)+(2)); // Result B = 12


        System.out.println( 5+6+ "Victoria" + 5 + 6 ); // 11Victora56;
        System.out.println( 5-6+ "Victoria" + 5 * 6 ); // Victora30
        System.out.println( 15/3 +"Victoria" + 15/ 3 ); // Victora5
        System.out.println( "Victoria" + 5 + 6 ); // Victora56
        System.out.println( "Victoria" + (5 + 6) ); // Victoria11
        System.out.println('A'+'A');


        System.out.println("--------// NO.# 10-------------");



        // NO. 10

        System.out.println("5+2 = " + 3+4 );  // "5+2 = " >>>> 34
        System.out.println("5+2 = " + (3+4)); // "5+2 = " >>>> 7
    }

}
