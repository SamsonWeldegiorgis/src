package day07_uniry_operators;

public class IncrementExamples5 {
    public static void main(String[] args) {

        int x = 2 + 3 * 2 / 1; //     2+ 3*2 = 2+ 6 = 8
        System.out.println(x); //    8

        int y = ( 2 + 3 ) * 2; //    10
        System.out.println(y); //

        int w = 78 / 2 * 2 + 3 - 5 % 5;  // 78/2 * 2 + 3-0 =
        System.out.println(w); //            81

        int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;  //  8+2+3+5-2-1-0+2
        System.out.println(i); //               17

        int a = 8;  //     7
        int b = a--;  //   8 > 7
        System.out.println(a);  //7
        System.out.println(b);  // 8

        int a1 =1; //  1
        int b1 = -a1-- + a1++ / -a1-- * --a1;
        //       -1> 0 + 0>1  / -1> 0 * -1
        //       -1  + 0 / -1 /* -1
        //        -1  /+1
        //           -1

        System.out.println(a1);//1  // -1
        System.out.println(b1);//-1

        int A = 50;  // 50
        int B = --A + A++ + A-- + A++;
        //      49 + 49>50 + 50>49 + 49>50
        //      49 + 49 + 50 + 49
        //        197



        System.out.println(A); // 50
        System.out.println(B);  // 197

        int X = 4;  //  4
        int Y = X * 4 - X++; //
        //      4 * 4 - 4    > 5
        //     4 * 4 -4
        //      12


        System.out.println(X); //  4 // 5
        System.out.println(Y);  //  12

        int t = 100; //   100
        int p = - ++t * -t-- / t++ + --t;  //
            //    - 101 * - 101>100 / 100> 101 + 100
         //        -100 * - 101 / 100 + 100
        //         -100 * -1 + 100
        //          100 + 100
        //             200

        System.out.println(t); // 100
        System.out.println(p);  //202 ????


        int M = 300;
        int N = 400;
        int U = ++M + N++      - M-- % 2     + --N % 2;
        //      301 + 400 >401   - 301>300 %2   + 400 %2
        //      301 + 400 - 301 % 2 + 0
        //      301+ 400- 1 + 0
        //      798

        System.out.println(M); //   300
        System.out.println(N);  //  400
        System.out.println(U);  //  700


        int R = 20;  //  20
        int W = -R-- +       -R++   + --R *     R-- % 2; //
        //      -20 > 19    - 19 > 20 + 19 * 19>18 %2;    >>   18
        //     -20        - 19   +   19   *  19%2

        //    - 20    -19 +    19      *  1
        //      -20   -19   + 19
        //       -39    + 19
        //       -20 ??????


        System.out.println(R); // 20   ////   18
        System.out.println(W);  // -20 ????????

        int R1 = 17;  //  16
        int W1 = -R1-- +     -R1++      + --R1 ;
        //      - 17 > 16  +  -16 > 17   + 16
        //      -17 -16 + 16
        //     - 17
        //       -

        System.out.println(R1); //16
        System.out.println(W1);  // - 17

        int R2 = 53;  //  52
        int W2 = R2-- ; // 53



        System.out.println(R2); //  52
        System.out.println(W2);  //53

        int R3 = 18;  //  19
        int W3 = ++R3 ; //19



        System.out.println(R3); // 19
        System.out.println(W3);  // 19











    }
}
