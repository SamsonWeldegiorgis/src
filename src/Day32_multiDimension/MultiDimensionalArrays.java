package Day32_multiDimension;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30,};
        int[] arr2 = {40, 50};
        int[] arr3 = {60, 70, 80, 90};
        //  0   1  2   3
        int[][] arr2D = {{10, 20, 30,}, {40, 50}, {60, 70, 80, 90}};  //
        System.out.println(Arrays.deepToString(arr2D));//  [[10, 20, 30], [40, 50], [60, 70, 80, 90]]
        System.out.println(Arrays.toString(arr2D[2]));// [60, 70, 80, 90]
        System.out.println(arr2D[2][2]);// 80

        System.out.println("  ----------------------------");

        String [] [] groups ={{"Ahmed", "Jimmy"}, {"Breana", "Victoria", "Daniel"},{"Natilia", "Aron", "Joy"}};

        System.out.println(Arrays.deepToString(groups));  // [[Ahmed, Jimmy], [Breana, Victoria, Daniel], [Natilia, Aron, Joy]]
        System.out.println(Arrays.toString(groups[1]));  // [Breana, Victoria, Daniel]
        System.out.println(groups [2][0]); // Natalia
    }
}
