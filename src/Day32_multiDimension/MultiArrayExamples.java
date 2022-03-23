package Day32_multiDimension;

import java.util.Arrays;

public class MultiArrayExamples {
    public static void main(String[] args) {


        int [] n = { 5,10,20,10};
        int [] m = { 5,10,100,39,19};

//        int [] [] all = {{ 5,10,20,10},{ 5,10,100,39,19} }; or
        int [] [] all = {n,m };
        System.out.println(Arrays.deepToString(all)); // correct one
        System.out.println("First Array: "+ Arrays.toString(all[0]));//5,10,20,10
        System.out.println("Secone Array: "+Arrays.toString(all[1]));

//        Arrays.sort(Arrays.toString(all[1]));

        int [] [] multi = {
                {90,80,70},  // index 0 array
                {19, 51, 1129, 12,-50,-11,0},   // index 1 array
                {10,1900},  //   // index 2 array
                {14}};  //   // index 3 array

        System.out.println(multi.length); // 4 arrays
        System.out.println(multi[0].length); // 3 elements
        System.out.println(Arrays.toString(multi[0])); // 90,80,70
        System.out.println((multi[1][2])); // 1129
        System.out.println((multi[3][0])); // 14
//        System.out.println((multi[3][1])); // out of bounds
        Arrays.sort(multi[1]);
        System.out.println(Arrays.toString(multi[1]));

    }
}
