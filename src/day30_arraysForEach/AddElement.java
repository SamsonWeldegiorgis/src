package day30_arraysForEach;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        /*
        Have a string array, add a number to the end, make your array bigger to store the new number
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you want to start with");
        int size= input.nextInt();
        int [] nums = new int [size] ;

        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Enter a number");
            nums[i]= input.nextInt();
        }
        System.out.println("Arrays so far :" + Arrays.toString(nums)) ;
        int [] expanded  = Arrays.copyOf(nums, nums.length+1);
        System.out.println("Enter the last number");
        expanded[expanded.length-1]=input.nextInt();

        System.out.println(Arrays.toString(expanded));



    }
}
