package day28_arrayPractice;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {


        double [] arr = new double[4];
        System.out.println(arr.length); // 4
        System.out.println(Arrays.toString(arr));// 0.0,0.0,0.0,0.0

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr)); // 30.99, 0.0 , 0.0 , 0.0

        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] = 5;
        System.out.println(Arrays.toString(arr)); //30.99, 12.55 , 10.20, 5.0

        // reassigning
        arr[2] = 2000;
        System.out.println(Arrays.toString(arr)); // 30.99, 12.55, 2000, 5.0

        arr = new double[5]; // creates a new array with 5 elements, and reassigns the arr reference to the new object
        System.out.println(Arrays.toString(arr)); //

        System.out.println(arr[1]); // 0.0


    }


}
