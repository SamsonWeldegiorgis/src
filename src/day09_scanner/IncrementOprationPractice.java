package day09_scanner;

public class IncrementOprationPractice {
    public static void main(String[] args) {

        int w= 78 / 2 * 2 + 3- 5 % 5;
          /*     39 * 2 + 3 - 5  % 5
                  78   + 3 - 5 % 5
                   78 + + 3- 0
                    78 + 3
                        81
           */


        System.out.println(w);


        System.out.println(" -----------------------------");


        int a = 8 ; // a= 8 > 7
        int b =a--;  // b = 8;

        System.out.println( "a:"+ a); // 8
        System.out.println("b:"+ b);  // 8
        System.out.println(--a); //
        System.out.println(a);  //



        int L= 50;// 50> 49    49    50    49    50
        int P=          --L +  L++  + L--+ L++;
        //                49  + 49  + 50 + 49
        //                      197


        System.out.println("L:"+ L); // 50
        System.out.println("P:"+ P); //

        System.out.println(" -----------------------------");

        int R= 20;// 20>  -20 + -19   + 20 (19) * 19  > 18
        int W=            -R--+ -R++  + --R * R-- % 2;
        //                -20 -19 + 19 * 19 % 2
        //                 -20 - 19 + 361 % 2
        //                 -20 - 19 + 1
        //                 -39 + 1
        //                      -38

                /*
                    361 % 1
                    how many times does 2 go into 360 evenly
                    2 into 361,. 180 tims > 360
                    1 is left ,,,,this left over is the remainder


                 */

        System.out.println("R:"+ R); // 18
        System.out.println("W:"+ W); // -38

        System.out.println(" -----------------------------");

        int U= 28;//       27 - 27 + 28(29) + 28 -28 -    27  >>  26 %2
        int V=            --U+ -U++ + ++U + --U - U-- * --U % 2;
        //                  27 - 27 +   29 +  28 - 28 * 27   %  2
        //                  27 - 27 +   29  + 28  -  756  % 2
        //                  27  - 27  + 29  + 28  -  0
        //                      0   +   57  - 0
        //                              57


        System.out.println("U:"+ U); // 26
        System.out.println("V:"+ V); //  57


        System.out.println(" -----------------------------");

        int e= 1;//      -1    + 0   / - 1   * 0(-1)  -1
        int f=           -e-- + e++ / -e-- * --e ;
        //                 -1  + 0 /- 1 * -1
        //                 -1 + 0 / 1
        //                  -1 + 0
        //                  -1



        System.out.println("d:"+ e); // -1
        System.out.println("f:"+ f); // -1






    }
}
