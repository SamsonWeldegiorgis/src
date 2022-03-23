package day07_uniry_operators;

public class Store {
    public static void main(String[] args) {

         String store = "Target";
         int numberOfTvs = 100;

        System.out.println("\nPerson comes into the store and bought a tv");
        System.out.println("Number of TVs now : " + --numberOfTvs);

        System.out.println("\nPerson comes into the store and bought a tv");
        System.out.println("Number of TVs in the store : " + --numberOfTvs);

        System.out.println("\nA Person comes into the store and put the tv into their cart ");
        System.out.println("Number of TVs now : " + numberOfTvs--);//(CHECKED) after they buy it will be subtracted

        System.out.println("Person bought it, now I have: " +numberOfTvs); // (BOUGHT)_check out !

        System.out.println( "I get a shipment ");
        numberOfTvs=numberOfTvs+13;

        System.out.println( "TVs in stock : "+ numberOfTvs); // 110 ; last 97+ new one 13 = 110

    }
}
