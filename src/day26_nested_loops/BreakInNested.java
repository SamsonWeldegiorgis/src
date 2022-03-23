package day26_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0 ; i<= 5 ; i++){
            System.out.println("i " + i);
            if (i==3) {
                // break; when the above break statement is run we stop the outer loop, which means
                       // both will no longer run. We get 3 full iterations of the outer loop, including the
                      // inner loop running start to finish then when i ==3 the outer loop will stop .
            }

            for ( int j =0 ; j < 2 ; j++) {
                System.out.println( "j " + j);
                //break;    if the break is here,the loop will iterate, but inner loop will
                             // execute the 1st iteration & the break runs, inner loop stops.;
                           // code resume after the outer loop iterations finishes
            }
            System.out.println();
             //break;    if the break is here, the 1st iteration of the outer loop will run, then the
                      // outer loop stops.
        }
    }
}
