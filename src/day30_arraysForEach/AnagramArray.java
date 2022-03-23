package day30_arraysForEach;

import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {

        /*
       listen
       silent
         */
        String str = "losten";
        String str2 = "silent";

        char [] one = str.toCharArray();
        char [] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

        if(Arrays.equals(one, two)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(one, two) ? "Anagram" : "Not Anagram");


    }


            }





