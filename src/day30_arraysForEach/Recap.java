package day30_arraysForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30,20,90,-15,60,};
        int [] arr2 ={-15,60,90,20,30};


        // sorting, and eqauling

        Arrays.sort(arr);         System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);         System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr,arr2));

        System.out.println("------charArray -------------");

        String [] pu = {"moon", "boom"};
        String pu1 = "moon, boom";

        char [] put = pu1.toCharArray();
        System.out.println(Arrays.toString(put));

        String [] split = pu1.split(",");
        System.out.println(Arrays.toString(split));

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr,arr2));

        System.out.println("----DeepToString/ Multidimensional----------");

        int [] [] arrJoin = { {30,20,90,-15,60,}, {15,35,-54,-248,}};

//        System.out.println(Arrays.sort(arrJoin[1]);
        System.out.println(Arrays.deepToString(arrJoin));
        System.out.println(Arrays.toString(arrJoin[1]));
        System.out.println(arrJoin[1][3]);

        String [] words = {"hello", "java", "saturday"};

        System.out.println("----String.join ----------");

        System.out.println(String.join("###", words));
        System.out.println(String.join("<>", words));
        System.out.println(String.join("=", words));

        System.out.println("----charArray & Split----------");

        String day = "Today is Saturday";
        String email = "samisarrr4@gmail.com457848153";
        System.out.println(Arrays.toString(day.toCharArray()));// return to char[]
        System.out.println(Arrays.toString(email.toCharArray()));
        System.out.println(Arrays.toString(day.split(" ")));  // return to string[]
        System.out.println(Arrays.toString(email.split("4")));

    }



}
