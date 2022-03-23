package day24_loopExample2;

import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {


        String a= "a gentleman";  // if we avoid e,,,,,= a gentle man
        String b= "elegant man";  // if we avoid first l,,,,,= a gentl man

        a=a.toLowerCase().replace(" ","");
        b=b.toLowerCase().replace(" ","");

        if ( a.length() == b.length()){

        for (int i=0 ; i <a.length();i++){
             char each = a.charAt(i);

             b=b.replaceFirst(each+"","");

        } if (b.isEmpty()){
            System.out.println("Anagram");

        }else   {
            System.out.println("Not Anagram");
        }}
}}
