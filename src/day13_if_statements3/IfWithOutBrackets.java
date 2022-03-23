package day13_if_statements3;

public class IfWithOutBrackets {
    public static void main(String[] args) {

        // ALWAYS BETTER TO USE CURLY BRACKETS INSTEAD WITH OUT BRACKETS

        if ( 4 > 2)
            System.out.println("Hello"); // hello

        System.out.println(" ___________________");

        if (4 >10)
            System.out.println("Bye"); // false, no result ( locating only the 1st line )
            System.out.println("Other line");  // it will be printed regardless true or false...

        System.out.println(" ___________________");


        if ( 3 %2 ==0)
        System.out.println("Even");
//        System.out.println(); // for this else don't know, so error showing
        else
            System.out.println("Odd");

        System.out.println(" ___________________");

        if (2== 2)
            System.out.println("2 number"); // it takes only for the first
        else if ( 4> 3)
            System.out.println("Other line 2");
        else if (4 <1)
            System.out.println("don't do it ");
    }
}
