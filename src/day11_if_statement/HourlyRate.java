package day11_if_statement;

import java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {
        /*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked
        calculate your net pay, with consideration of overtime pay
        if you worked more than 40 hours you get overtime pay for the hours
        past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay
        and 3 hours overtime pay)
         */

//        double hourlyRate = 20.5;
//        double numberOfHoursWorked = 60; // total worked
//
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Put the hourly rate: ");
//         hourlyRate = scan.nextDouble();
//        System.out.println("Put the number of hours you worked: ");
//         numberOfHoursWorked = scan.nextDouble();
//
//
//        if (numberOfHoursWorked==40){
//            System.out.println("\nYour total hours balance is : "
//                    +(hourlyRate*numberOfHoursWorked));} // 40*20.50 = 820
//         if (numberOfHoursWorked>40){
//            System.out.println("\nYour current balance after the overtime is :"
//                    +((hourlyRate*numberOfHoursWorked)+((numberOfHoursWorked-40)*
//                     1.5*(hourlyRate))));}  // 50 = (40)*20.5 + (50-40)*1.5(20)


///////////////////CORRECTIONS OF SAIM ///////////////////////////

        double hourlyRate1 = 10.5;  // scanner.nextDouble()
        double numberOfHours1 = 50;  // scanner.nextDouble()
        double netPay1;
        String message;

        if (numberOfHours1 > 40) {
            // when then number of hours >40; we will get an extra 1.5 for overtime pay.

            double overtimeHours1 = numberOfHours1 - 40;  // overtime= 44 - 44 ;
            netPay1 = 40 * hourlyRate1;    // 40(hard coded , b/s it is fixed)  * 22.5
            netPay1+=overtimeHours1* hourlyRate1 * 1.5 ;
            message ="You workded "+ numberOfHours1+" hours at a rate of "
                    +hourlyRate1+" but "+ overtimeHours1+ " of the  \nhours were overtime, " +
                    "so you got an additional pay \nfor those hours. Your net pay is $"+ netPay1;


        } else {
            netPay1 = numberOfHours1 * hourlyRate1; // when the number of hours <= 40, we will run this code
                                                  // 40 * 22.50
            message ="Your net pay is "+ netPay1+". You have worked "+ numberOfHours1+" hours \nat a rate of " + hourlyRate1 +" and there was no overtime.";


        }
        System.out.println("\n"+message);
    }
    }