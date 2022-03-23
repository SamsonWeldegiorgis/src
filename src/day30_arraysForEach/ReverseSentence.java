package day30_arraysForEach;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        /*
        today is monday ..........reverse it ....monday is today
         */


        String sentence = "Today is monday, we learned String methods";
        String [] words = sentence.split (" ");

        String reversed = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed.trim());


    }}




