package day07_uniry_operators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;


            // Pre- Incrementing
        System.out.println("\nWe pick up 1 water");
        System.out.println("How many items in the cart: " + ++numberOfItems);
        // Pre- Increment , so the number of items increases right away, then
        // it is printed

        price=price +2.5 ; // take the price value, which 0, and add 2.5, and
                            // they reassign to the price variable.

        System.out.println(" We pick up 2 eggs");
        System.out.println("How many items in the cart:" + ++numberOfItems);
        System.out.println("How many items in the cart:" + ++numberOfItems);

        // Post- Incrementing

        System.out.println("Number of items : " + numberOfItems++); // 3
        System.out.println("Number of items : " + numberOfItems++); // 4
    }
}
