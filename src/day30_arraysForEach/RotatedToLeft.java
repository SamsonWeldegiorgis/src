package day30_arraysForEach;

import java.util.Arrays;

public class RotatedToLeft {
    public static void main(String[] args) {



        // rotated left

        //    {1, 2, 3, 4, 5,};   >>>>>>>>>>>[2, 3, 4, 5, 1]

        int[] x = {1, 2, 3, 4, 5,};

        int temp = x[0];

        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];

        }
        x[x.length - 1] = temp;

        System.out.println(Arrays.toString(x));

        // work for rotated right

        //    {1, 2, 3, 4, 5,};   >>>>>>>>>>>[5,1,2,3,4,]
    }
}
