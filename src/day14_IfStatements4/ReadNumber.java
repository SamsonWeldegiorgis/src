package day14_IfStatements4;

import java.time.chrono.JapaneseChronology;
import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        /*

Write a program that will read a number from the user. This number will be a year. Use that given year to figure out if there was a pandemic in that year, and if there was which one.

    Data to use:
        1346-1353: The Black Death
        1665-1666: Great Plague of London
        1770-1772: Russian plague
        1889-1890: Flu pandemic
        1916: American polio epidemic
        1918-1920: Spanish Flu
        2009-2010: H1N1 Swine Flu pandemic
        2014-2016: West African Ebola epidemic
        2020-2021: COVID-19

        Any year not in those ranges : NO pandemic

         */

//        int pandemicYear = 2080;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("\nEnter the year please : ");
//        int pandemicYear = scan.nextInt();
//        String printPandemic;
//
//        if (pandemicYear >= 1346 && pandemicYear <= 1353) {
//            System.out.println("THe Black Death");
//        } else if (pandemicYear >= 1665 && pandemicYear <= 1666) {
//            System.out.println("Great Plague of London");
//        } else if (pandemicYear >= 1770 && pandemicYear <= 1772) {
//            System.out.println("Russian Plague ");
//        } else if (pandemicYear >= 1889 && pandemicYear <= 1890) {
//            System.out.println("Flu Pandemic ");
//        } else if (pandemicYear == 1916) {
//            System.out.println("American Polio ");
//        } else if (pandemicYear >= 1918 && pandemicYear <= 1920) {
//            System.out.println("Spanish Flu");
//        } else if (pandemicYear >= 2009 && pandemicYear <= 2010) {
//            System.out.println("H1N1 Swine Flu Pandemic");
//        } else if (pandemicYear >= 2014 && pandemicYear <= 2016) {
//            System.out.println("West African Ebola epidemic");
//        } else if (pandemicYear >= 2020 && pandemicYear <= 2022) {
//            System.out.println("\n" + pandemicYear + " was the year of COVID-19");
//        } else System.out.println("\nNone pandemic year");


        ///////////////////////////another way using String Printing ////////////

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the year please : ");
        int year = scan.nextInt();
        String pandemic;

        if (year >= 1346 && year <= 1353)
        {
            pandemic = "The Black Death";
        } else if (year >= 1665 && year <= 1666)   // year == 1665 || year == 1666
        {
            pandemic = "Great Plague of London";
        } else if (year >= 1346 && year <= 1353)
        {
            pandemic = "Russian Plague";
        }
        else if (year >= 1889 && year <= 1899)
        {
            pandemic = "Flue Pandemic";
        }   else if (year == 19160){
            pandemic="American Polio Epidemic";
        } else if (year >= 1918 && year <= 1920)
        {
            pandemic = "Spanish Flue";
        } else if (year >= 2009 && year <= 2010)
        {
            pandemic= "H1N1 Swine Flu Pandemic";
        } else if (year >= 2014 && year <= 2016)
        {
            pandemic = "West African Ebola epidemic";
        } else if (year >= 2020 && year <= 2022)
        {
            pandemic= "\n" + year + " was the year of COVID-19";
        } else {
            pandemic= "\nNot pandemic year";
        }

        System.out.println(pandemic);



    }}
