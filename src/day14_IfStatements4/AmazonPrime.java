package day14_IfStatements4;

public class AmazonPrime {
    public static void main(String[] args) {
        /*
         Task :
            declare and assign price variable
            declare and assign a boolean = hasPrime variable

            possible outputs:
                prime member : Eligible for 2 days shipping
                not prime member & item price is more than 25 :
                    eligible for regular free shipping

                not prime member & item price is less than 25:
                    Not eligible for free shipping . Shipping fee : 3.99
         */

          double price = 15.9;
          boolean hasPrime= false ;

          if (hasPrime) {

              System.out.println("\nEligiible for 2 days shipping");
          } else
          { if ( price>=25) {
              System.out.println("\nEligible for regular free shipping");


          }else {
              System.out.println("\nNot eligible for free shipping: shipping fee  : 3.99");
              price += 3.99;  // price = price + 3.99 ;
              System.out.println("Price will be :" +price);


        }}}
}
