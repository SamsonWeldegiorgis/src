package day30_arraysForEach;

import java.util.Scanner;

public class LongestRepetativeString {
    public static void main(String[] args) {

        /*
        input= abcababcababcab...........output = abcab
        input = abcdefabcdef abcdefabcdef   output = abcdefabcdef
    	input = abcdefxabcdef			   outpu =  "There is no repetitive substring"
 =
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = input.nextLine();

        String str1 = str;
        String temp = "";
        int count = 0;
        String res = "";
        int max = Integer.MIN_VALUE;
        boolean isRepetitive = false;

        for(int i = 0; i < str.length()/2 ; i++){
            temp += str.charAt(i);

            while (str1.contains(temp)){
                str1 = str1.replaceFirst(temp, "");
                count++;
            }
            if(count > 1 && str1.isBlank()){
                if(temp.length() > max){
                    isRepetitive = true;
                    max = temp.length();
                    res = temp;
                }
            }
            str1 = str;
            count = 0;

        }
        System.out.println("\n---------RESULT---------");
        System.out.println(isRepetitive ? res : "There is no repetitive substring");


    }
    }

