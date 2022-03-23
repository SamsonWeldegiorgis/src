package day21_string4_Loop;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();  // empty console for separation

//        while () {
//            System.out.println("Hello World");     /// don't PRINT THIS ( infinity loop )

//          }}

            int num = 0;

         while (num++<= 10){
             System.out.println("Hello World "+ num);
         }


         // or

        int num1 = 0;// incrementing

        while (num1<= 10){
            System.out.println("Hello World "+ num1++);
        }

        // or

        int z = 1;   // incrementing

        while (z <=20){
            System.out.println("Hello Universe "+ z);
            z++;
        }                                           // ( )  >> condition
                                                    // {   }  >> loop
        /*
        flow of above :
            z = 1
            z < = 20 >> 1 >>true > goes into the loop
            runs code : System.out.println("Hello Universe "+ z);
            Hello Universe 1 ;
            z++ . post increment z > 2

            2 < = 20 >> 1 >>true > goes into the loop
            runs code : System.out.println("Hello Universe "+ z);
            Hello Universe 2 ;
            z++ . post increment z > 3.........goes on like that

            goes until z = 51 ,,,,,,,,51<=50 >> false..so the loop stops !

         */




    }}
