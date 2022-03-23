package Quizzes;

import java.util.Arrays;

public class ArraQuizz {
    public static void main(String[] args) {

//        //1.  array declarations are :
//        int [] arr = {1,2,3,4};
//        int arr1 [] = {1,2,3,4};
////        int [] arr2= new int[]; // wrong

        System.out.println("---------------");

        // 2. Array size is fixed

        System.out.println("---------------");

        // 3.
        char [] array = {'D','C','B','A' } ;
        Arrays.sort(array);

        for (char each : array) {
            System.out.println(each + " ");
            if (each == 'D'){
                continue;
            }
        }            /////answer : ABCD

        System.out.println("---------------");
        // 4. what is the result of the following code fragment :

        String [] days = {"sun", "mon" , "wed" , "sat"};

        int n = 0 ;
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
        System.out.println(n);   // answer : 3

        System.out.println("---------------");
        // 5. what is the result of the following code fragment :

            int[] num1 = new int [3];
            int[] num2 = {1,2,3,4};
            num1=num2;

        for (int i = 0; i <num1.length; i++) {
            System.out.println(num1[i]);
        }
            ///answer ........1234


        System.out.println("---------------");
        // 6. what is the result of the following code fragment :

        int [] intArr = {15,30,45,60,75};
        intArr [2] = intArr[4];
        intArr [4] = 90;
        System.out.println(Arrays.toString(intArr)); /// answer [15,30,75,60,90

        System.out.println("---------------");
        // 7. what is the result of the following code fragment :
        String [] planets = {"mercury","venus","earth","mars"};
        int x = planets.length;
        int y = planets[1].length();
        System.out.println(x+ " " + y);  // answer 45



    }

}
