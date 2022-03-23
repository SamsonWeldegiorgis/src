package day28_arrayPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        ex: [1,2,3,4,5],,,,,,,,,,,,,,,,,,,,,,,[5,4,3,2,1,]
         */
//        int [] arr = {1,2,3,4,5};
//        int [] reverse = new int [arr.length];
//
//        for (int i = arr.length-1 ; i >= 0 ; i--) {
//            System.out.println(arr[i]);
//
//        }
//    }
//}

////////////////////another option /////////////////////
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//
//            reverse[i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(reverse));
//
//    }}

////////////////another type /////////////////////////
//
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] reverse = new int[arr.length];
//
//        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//            reverse[j] = arr[i];
//        }
//        System.out.println("I: "+  Arrays.toString(arr));
//        System.out.println("J: "+Arrays.toString(reverse));
//
//    }}

//////////////another type /////////////////////////

         int[] arr = {1, 2, 3, 4, 5};
         int[] reverse = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++) {
                reverse[arr.length-1-i] = arr[i];
                }
                System.out.println("I: "+  Arrays.toString(arr));
                System.out.println("J: "+Arrays.toString(reverse));

                }}
                 /*
                        i=0
                        reverse[5-1-0] = arr[0]
                        reverse[4] = arr[0]
                        i=1
                        reverse[5-1-1] = arr[1]
                        reverse[3] = arr[1]
                        i=2
                        reverse[5-1-2] = arr[2]
                        reverse[2] = arr[2]
                        i=3
                        reverse[5-1-3] = arr[3]
                        reverse[1] = arr[3]
                        i=4
                        reverse[5-1-4] = arr[4]
                        reverse[0] = arr[4]
                    */