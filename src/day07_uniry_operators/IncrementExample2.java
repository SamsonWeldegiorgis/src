package day07_uniry_operators;

public class IncrementExample2 {

    public static void main ( String [] args) {

        // Post - INCREMENTING
        int age = 20;
        System.out.println (age); //20
        System.out.println ( age++);// 20 printing the same unchanging , current value of age !
        System.out.println ( age);// 21 ;  updated by 1 = 21 , keep tracking from top to bottom ,rgt to lft

        System.out.println ( age++);// 21 ( it saves/update the before status )
        System.out.println ( age);// 22 ( it shows the current )

        System.out.println ( age++);// 22 ( it saves the before status )
        System.out.println ( age);// 23

        // Pre - INCREMENTING
        System.out.println ( ++age);// 24 ( it saves the before status of the above last value )
        System.out.println ( age);// 24

        System.out.println ( ++age);// 25 ( it saves the before status of the above last value )
        System.out.println ( age);// 25

        System.out.println ( age++);// 25 ( it saves/update the before status )
        System.out.println ( age);// 26 ( it adds now  )
    }
}
