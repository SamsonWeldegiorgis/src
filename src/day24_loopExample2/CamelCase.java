package day24_loopExample2;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
        	Today is SUNDAY   ===   todayIsSunday
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String str = input.nextLine().toLowerCase();

        String camelCase=str.substring(0,1);
        // String camelCase="";

        for (int i=1 ; i<str.length(); i++){

            if (str.charAt(i-1)==' '){
                camelCase+=str.substring(i,i+1).toUpperCase();  // ("" + str.chartAt(i)).toUppercase
                // sub(i,i+1) is the same as ChartAt(i) but he types are different
            }else {
                camelCase+=str.charAt(i);  // Today
        }
    }
        System.out.println(camelCase.replace(" ",""));
}}
