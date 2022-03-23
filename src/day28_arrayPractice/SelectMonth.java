package day28_arrayPractice;

import day07_uniry_operators.SalaryCalculator;
import day19_stringExamples2.LongestWithA;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*
        Ask the user the month number they want, print month name
        1- January    ......12  - December
        Assume only valid numbers are given, but as a challenge you can handle invalid numbers
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Which month do you want ");

        int mon =1;

         mon = input.nextInt();  // 4

        String [] month = {"January", "February","March", "April", "May", "June",
                    "July","August","September", "October", "November", "December"};
        System.out.println(month[mon-1]);

    }
}
