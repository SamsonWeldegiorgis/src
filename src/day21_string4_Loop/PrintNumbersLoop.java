package day21_string4_Loop;

public class PrintNumbersLoop {
    public static void main(String[] args) {
        /*
        print all the even numbers from 1-100 on separate lines
        print all the odd numbers from 1-100, but all in one line with spaces b/n each numbers
         */

        int n = 2;      // approach for EVEN

        while(n <= 20) {

            System.out.println("n: "+n);
            n+=2;
        }

        System.out.println(" -=-----------------");
        // or another approach for EVEN

        int m = 2;

        while(m <= 20) {
            if (m % 2 == 0) {
                System.out.println("M: "+m);
            } m++;
        }
        System.out.println(" -----------------");
        // Approach for ODD

        int o = 1;
        while (o <=20) {
            if (o %2==1){
                System.out.println("O: "+ o);
            } o++;
        }

        System.out.println(" -----------------");
        // Another Approach for ODD

        int p = 1;

        while ( p <=20){
            System.out.println("P: "+p+ " ");
            p+=2;    // a = a + 2 ;
        }

        System.out.println(" -----------------");
        // another Approach for ODD

        int r = 0;
        while ( r++ <= 20) {
            if (r % 2 == 1) {
                System.out.print("r: " + r + " ");
            }
        }


    }
}
