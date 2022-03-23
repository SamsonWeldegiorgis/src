package day30_arraysForEach;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3,6,2,68,32,-2,24};
        Arrays.sort(nums);
        int [] notSorted = nums; // does not make a new array object
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        // Q : Max and Min from Array
        System.out.println("Min: "+ nums[0]);
        System.out.println("Max: "+ nums[nums.length-1]);
    }
}
