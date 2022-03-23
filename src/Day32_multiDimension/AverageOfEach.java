package Day32_multiDimension;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        /*
        Given a 2D array, find the average of each inner array..
        and extra : average of the whole array....
        ex: 3,4,5,6  ........
            5,2,6,
            10,20,30,
         */

        int [] [] num1 = {
                       {3,4,5,6},
                        {5,2,6},
                     {10,20,30} };

        int [] [] newNumber = {{3,4,5,6},{5,2,6},{10,20,30} };
//
//        for (int [] eachArray: newNumber) {
//
////            System.out.println(Arrays.toString(eachArray));
//
//            double sum = 0;
//            for ( int eachNumber : eachArray) {
//                  sum += eachNumber;
//            }
//            System.out.println(Arrays.toString(eachArray)+ " the average is: " + (sum)/eachArray.length);
//        }
     ////////////////////for the whole average

        System.out.println(" --------------------------------");

        double total = 0;
        int totalLength = 0 ;

        for (int [] eachArray: newNumber) {

//            System.out.println(Arrays.toString(eachArray));

            double sum = 0;
            for (int eachNumber : eachArray) {
                sum += eachNumber;// each counted
            }
            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum) / eachArray.length);
            total += sum;
            totalLength += eachArray.length;
        }
        System.out.println("Average of the whole 2D array: " +(total/totalLength));


    }}



