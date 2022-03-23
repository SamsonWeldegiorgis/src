package day19_stringExamples2;

import java.util.Scanner;

public class MergeStrings {
    public static void main(String[] args) {

        /*
        two strings : hard code to have 3 characters each
        merge the strings together

        ex : abc
             xyz
                 output : axbycz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut first word ");
        String str1 = input.nextLine();
        System.out.println("Put second word ");
        String str2 = input.nextLine();

        String merged = "";
        merged += str1.charAt(0);   // += is used to make the next number !
        merged += str2.charAt(0);
        merged += str1.charAt(1);
        merged += str2.charAt(1);
        merged += str1.charAt(2);
        merged += str2.charAt(2);

        System.out.println(merged);  // merged wise


        System.out.println(" --------------------------");

        ////////////another approach /////////////

        System.out.println(""+str1.charAt(0)+str2.charAt(0)
                +  str1.charAt(1)+str2.charAt(1)
                + str1.charAt(2)+str2.charAt(2));   // concatingting


    }
}
