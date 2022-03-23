package day14_IfStatements4;

import java.util.Scanner;

public class MovieLength {
    public static void main(String[] args) {
        /*

The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
        3, 3.5 or 4 --> 15.99

         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the price please: ");
        double duration = input.nextDouble();
        String message ="";
        int price ;

        if (duration==1.0 ) {
            System.out.println("Price is $8.99");

        }else if (duration==1.5){
            System.out.println("Price is $10.50");
        }else if (duration == 2.0) {
            System.out.println("Price is $12.99");

        }else if ( duration ==2.5 ){
            System.out.println("Price is $14.50");

        } else if ( duration ==3 || duration == 3.5 || duration ==4.0){
            System.out.println("Price is $15.99");


        }else {
            if (duration <= 0) {
                System.out.println( "Movies cannot be less than 0 minutes");
            } else if (duration > 4) {
                System.out.println("Movies cannot be more than 4 hours");
            }
//            String ad = " Price is $" + message;
//
//            System.out.println(ad+"\n"+price);
        }
    }
}
