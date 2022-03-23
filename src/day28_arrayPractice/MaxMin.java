package day28_arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
            /*
    Declare and assign an array 500 , 120 ,-80 , 90 , 200 , 250,-10
    find the biggest number
    find the smallest number

     */

        int [] numbers = { 500 , 120 ,-80 , 90 , 200 , 250,-10};

            int max=numbers[0];
            int min=numbers[0];

        for  (int i =0 ; i <numbers.length ; i++) {

            int number1 = numbers[i];

            if (number1 > max) { // if (nums [i] > max)
                max = number1;   // max = nums[i]
            }
            if (number1 < min) {
                min = number1;
            }
        }//        Arrays.sort(numbers);
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Sorted one :" + Arrays.toString(numbers));
    }}

