package day30_arraysForEach;

import java.util.Arrays;
import java.util.Locale;

public class CharArray {
    public static void main(String[] args) {

        char[] letters= {'j','a','v','a'};

        String word = "java";

        // converting a String to a char [] array
        char [] java = word.toCharArray();

        System.out.println("Array letter: "+ Arrays.toString(letters)); //
        System.out.println("Array letter: "+ Arrays.toString(java));

      //  System.out.println(letters);  // String work with cha [] array internally so the char [] is able to be printed as the String

        System.out.println("--------array string------------------------");
        // example :

        for(char eachChar : java){ // for (char eachChar : word.toCharArray()) {
            System.out.println(eachChar);  // j a v a
        }

        for (char eachChar : word.toCharArray()){
            System.out.println(eachChar);  // j a v a
        }
        System.out.println(java[0]);

        System.out.println("--------char to array------------------------");

        // converting a char array to a String

         char [] day= {'m' , 'o' , 'n' , 'd' , 'a' , 'y'}; // this is array
        System.out.println(day.length);

        String strDay= new String(day);  // not array but a normal string
        System.out.println(strDay); // monday
        System.out.println(strDay.toUpperCase());// MONDAY
        System.out.println(day); // monday
//        System.out.println(day.toUpperCase()); // can not use String method on a char []


        System.out.println("-------for Practice------------------------");

        String wordLetter = "players";

        char [] players = wordLetter.toCharArray();
        System.out.println("Array players : "+ Arrays.toString(players));

        for (char eachWord : players){
            System.out.print(eachWord + " ");

            System.out.println("-------for Practice------------------------");

            String jobs = "sdet";

            char [] sdet = jobs.toCharArray();
            System.out.println(Arrays.toString(sdet)); // [s,d,e,t]
            System.out.println(Arrays.toString(sdet).toUpperCase()); // [S D E T ]

            for (char eachJob : sdet){
                System.out.println(eachJob);
            }
        }
    }
}

