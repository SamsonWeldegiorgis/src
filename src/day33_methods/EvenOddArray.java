package day33_methods;

import java.util.Arrays;

public class EvenOddArray {

    public static void evenAndOdd (int [] arr){
        int even = 0;
        int odd = 0 ;
        for(int each : arr){
            if (each % 2 ==0){
                even++;
            }else {
                odd++;
            }
        }
        int [] result = {even, odd};
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int [] intArr = {1,3,5,2};
        evenAndOdd(intArr);
        int [] a = {1,2,3,4};
        evenAndOdd(a);
    }
}
