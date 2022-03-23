package day04_variables;

public class Fruits {

    public static void main(String[] args) {
        int apples = 50;
        System.out.println("apples:" + apples);
        int grapes =100;
        System.out.println("Grapes:" + grapes);
        int bananas =150;
        System.out.println("Bananas :" + bananas);

        System.out.println( " How many apples do we have " + apples);
        // to concatenate
        System.out.println(" Grapes : " + grapes);
        System.out.println(" Bananas : " + bananas);

        System.out.println("Apples are " + apples+ ", Grape are " + grapes + " and Bananas are"+bananas);


        System.out.println( "sold some apples : ");
        apples = 25; // reassign apples to have a value of 25

        int price =20;


        System.out.println(" The price of my apples is $" +apples );
        System.out.println(" The price of my " + apples+ "  is $"+ price );
    }
}
