package day09_scanner;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        /*
            Task :
            create and assign these variables:
                name
                arey they citizen
                do have criminal backgroud
                age
                determine if they eligible to vote based on
                    citizen, no criminal bckgrd, age above 18
         */

       /*   System.out.println( 4<3 || false); // False
                 System.out.println( 4>3 || false); // True
             System.out.println( 3>4 || false); // false


        */

            String name = "Thomas";
            boolean isCitizen = true;
            boolean hasCriminalBackground = false;
            boolean hasCriminalBackground4 = true;
            int age = 49;

            boolean isEligibleToVote = age>=18 && isCitizen && hasCriminalBackground ;
     // or write boolean isEligibleToVote = age>=18 && isCitizen && hasCriminalBackground== true ;
          boolean isEligibleToVote2 = age>=18 && isCitizen && hasCriminalBackground4 ;


        System.out.println("\nMr." + name+ " is eligible to vote: "+isEligibleToVote); // false
        System.out.println("\nMr." + name+ " is eligible to vote: "+isEligibleToVote2); // true


        String name1 = "Thomas";
        boolean isCitizen1 = true;
        boolean hasCriminalBackground1 = true;
        boolean hasCriminalBackground5 = false;
        int age1 = 49;


        boolean isEligibleToVote1 = age1>=18 && isCitizen1 && !hasCriminalBackground1 ;
        boolean isEligibleToVote5 = age1>=18 && isCitizen1 && !hasCriminalBackground5 ;

        System.out.println("\nMr." + name+ " is eligible to vote: "+isEligibleToVote1);  //false

        System.out.println("\nMr." + name+ " is eligible to vote: "+isEligibleToVote5);  //true

    }
}
