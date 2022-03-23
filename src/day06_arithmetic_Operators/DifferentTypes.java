package day06_arithmetic_Operators;

public class DifferentTypes {
    public static void main(String[] args) {

        // both are int

        System.out.println("\n -------both are int--------");

        System.out.println(10-5);
        System.out.println(10*5);

        // double and int
        System.out.println("------double and int-----");

        System.out.println(10.0/5);

        System.out.println("-----  //  int   / double----");
        //  int   / double

        System.out.println(10 /5.0);

        System.out.println("------Casting type ( both the same -----");
        System.out.println( (int)(10.0 / 5.0 ));
        System.out.println( (int)(10.0 / 5 ));
        System.out.println( (int)(10.0 / 0.2 ));
        System.out.println( (int)10.0 / 0.2 );
        System.out.println( (int) 10.5 /5);
        System.out.println( (double) 10.5 /5);



        System.out.println("-------------------------");

        byte b1 = 10 ;
        byte b2 = 20 ;

//        byte sum = b1 + b2;  // this will not work b/s the values get changed to int during
//                             // the calcualtion

        int sum = b1 + b2;  // option #1
        System.out.println(sum);
        byte sumByte = (byte ) (b1+b2);  // casting is option #2
        System.out.println(sumByte);

    }
}
