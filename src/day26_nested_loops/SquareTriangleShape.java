package day26_nested_loops;

public class SquareTriangleShape {
    public static void main(String[] args) {
        /*

         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *

         */

        char dot = '*';

        for(int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                System.out.print('*' + " ");
            }
            System.out.println();
        }


        ////////////////////////////Triangular Shape

                 /*
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *

         */



        for(int i = 0 ; i < 8 ; i++){
            for (int j = 0 ; j < i ; j++){

                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
