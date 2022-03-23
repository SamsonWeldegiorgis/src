package day30_arraysForEach;

import java.util.Arrays;

public class LongestRepetitive {
    public static void main(String[] args) {




        String word = "abcdefabcdefabdcdefabcdef";
//        String [] split  = word.split("abcdefabcdef");
//        System.out.println(split.length);
//        System.out.println(Arrays.toString(split));

        word = "abcccdefaaaabbbbcdefffffabdcdefabcdef";
        String temp= "";
        String longestOne="";

        for(int i = 0 ; i<word.length()/2 ; i++){

            temp+= word.charAt(i);
            String [] s = word.split(temp);
//            System.out.println(Arrays.toString(s));

            if (s.length==0 && longestOne.length() <temp.length()){
//                System.out.println(temp);
                longestOne = temp;
            }

            } if (!longestOne.isEmpty()){
        System.out.println(longestOne);

            }else   {
            System.out.println("There is NO repetitive substring");
        }
}}
