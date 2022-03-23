package Quizzes;

import java.util.Arrays;

public class ArrayQuiz {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        arr [2] = arr [4];
        arr [4] = 7;                            //   0 1 2 3 4 5
        //          1,2,3,4,5,6,
        System.out.println(Arrays.toString(arr)); // 1,2,5,4,7,6
        // 1,2,3,4,5,6,
        // 0,1,4,7,7,6


        ///////////////////

        int [] first = new int [3];
        int [] second = {1,2,3,4,};


        first=second;  //

        System.out.println(Arrays.toString(first)); // 1,2,3,4
        System.out.println(Arrays.toString(second)); // 1,2,3,4

        ///////////////////////////////////

        String [] fruit =  {"banana" , "apple" , "orange"};
        int a = fruit.length; // 3
        int b = fruit[1].length(); // 5

        System.out.println((a));
        System.out.println((b));

        ///////////////////////////////////

        int arr1 [] = {1,2,3};
        int arr2 [] = new int [3]; // we can't declare this array with out size....

        //////////////////////////////////

        int n=0;
        String [] days = {"sun", "mon", "wed", "sat" };

        for (int i = 0; i <days.length ; i++) {


        switch (days[i]){
            case "sat":
            case "sun":
                n-=1;
                break;
            case "mon":
                n++;
            case "wed":
                n+=2;
        }

        }
        System.out.println(n);

    }
}
