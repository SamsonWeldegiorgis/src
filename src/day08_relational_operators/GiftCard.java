package day08_relational_operators;

import java.util.zip.DeflaterOutputStream;

public class GiftCard {
    public static void main(String[] args) {

        /*
        Task : declare and assign a gift card with 200
                buy 2 items, buy 1 item for x price
                and subtract from your gift card
                Buy item 2 for x price and subtract form your gc
                Print the remaining balance of your gc
         */

            double giftCard = 200;  // use always Double to use for money !
            double bread = 10;
            double  potato = 50;

        double total = giftCard-bread;
        double total1= total-potato;

        System.out.println("\ntotal: "+ total);
        System.out.println("Balance :"+total1);


        ///////////////////CORRECTIONS ////////////////////

        double giftCard1 = 200;
        System.out.println(" Buy item 1 for 100$");
        giftCard1-=100.50; // giftcard = giftcard -100.50 = 99.50;

        System.out.println(" Buy item 2 for 40$");
        giftCard1-=40; // giftcard = giftcard -40 = 59.50 ;

        System.out.println(" Your gift card balance is now : $"+ giftCard1);



        // discounted
        giftCard1 *= 0.50;

        System.out.println(" Discounted : $"+ giftCard1); //29.75


        double giftCard3 = 200;

        double item1Price = 15.5;  // get 20% discount



        double item2Price = 48.8;

//        double item1Price += 40;

        System.out.println("giftCard3 = " + giftCard3);




    }
}
