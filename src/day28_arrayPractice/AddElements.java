package day28_arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        /*
        declare and assing an array of numbers, sum all the numbers
         */

        int [] numbers = {40,50,60,12,65};

        System.out.println(Arrays.stream(numbers).sum()); // 227

        for (int i= 0 ; i<3; i++){
            System.out.println("Hard coded sum: " +(numbers[0]+numbers[1]+numbers[3]));

            int sum=0;
            for  (i =0 ; i <numbers.length ; i++){
                sum+= numbers[i];
            }
            System.out.println("The sum is: "+sum);  // 227
        }

    }
}
