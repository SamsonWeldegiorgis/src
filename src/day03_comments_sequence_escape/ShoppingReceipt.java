package day03_comments_sequence_escape;

import java.nio.file.Watchable;

public class ShoppingReceipt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println( " \t\tWELCOME TO THE STORE");
        System.out.println("====================================");

        System.out.println("--------------------------------");

        System.out.println(" Cake               $24");
        System.out.println(" Water              $3.99");
        System.out.println(" Apple Juice        $7.50");
        System.out.println(" Bread              $4.25");

        System.out.println("--------------------------------");


        System.out.println(" TOTAL AMOUNT :     $39.744");
        System.out.println(" TAX :              $3.90");

        System.out.println(" GRAND TOTAL :      $43.64");
        System.out.println("--------------------------------");
        System.out.println("***************THANK YOU *******");





        System.out.println("=====================================");
        System.out.println( " \t\tWELCOME TO THE STORE");
        System.out.println("====================================");

        System.out.println("--------------------------------");

            /* better coding using program source code */
        // It doen't matter if you do all
        /** if not get it in time */

        // TODO : MOON



        int Cake = 24;
        float water = 3.99F;
        float AppleJuice = 7.50F;
        float Bread = 4.25F;
        float Tax = 3.90F;


        System.out.println(" Cake\t\t         "         + Cake);
        System.out.println(" Water  \t          "        + water);
        System.out.println(" Apple Juice          "  + AppleJuice);
        System.out.println(" Bread                " +      Bread);

        System.out.println("--------------------------------");


        System.out.println(" TOTAL AMOUNT  :     "   + (Cake+ water+AppleJuice+Bread));
        System.out.println(" TAX :\t\t\t\t "               + Tax);

        System.out.println(" GRAND TOTAL :\t\t " +( Cake+water+AppleJuice+Bread+Tax));
        System.out.println("--------------------------------");
        System.out.println("***************THANK YOU *******");


    }


}
