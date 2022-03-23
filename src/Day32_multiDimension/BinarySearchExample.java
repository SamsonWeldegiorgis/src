package Day32_multiDimension;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4,10,30,100,};
        System.out.println(Arrays.binarySearch(nums,4)); // 0,,,,like index

        System.out.println(Arrays.binarySearch(nums,100)); // 3
        System.out.println(Arrays.binarySearch(nums,200)); // -5
        System.out.println(Arrays.binarySearch(nums,6)); // -2
        System.out.println(Arrays.binarySearch(nums,20)); // -3

        int [] num1 = {40,-5,65,12,-55,100};
        Arrays.sort(num1);
        System.out.println("So far :      " + Arrays.toString(num1));
        System.out.println("Its position is:"+ Arrays.binarySearch(num1,-55));

    }
}
