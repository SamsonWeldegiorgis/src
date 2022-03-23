package day30_arraysForEach;

import java.util.Arrays;

public class MultipleOfTen {
    public static void main(String[] args) {
        /*
        int { 5,4,40,1,60,2,30,34,70,43,2,80,67}
        output { 5,4,40,40,60,60,30,30,70,70,70,80,80}
         */

          int [] newArray=  { 5,4,40,1,60,2,30,34,70,43,2,80,67};
          int factor=0;


        for (int i = 0; i <newArray.length ; i++) {

            if (newArray [i] % 10 ==0){
                factor=newArray [i]/10;
            }

            if (factor>0){
                newArray[i] = factor * 10 ;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
