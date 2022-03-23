package day19_stringExamples2;

import java.util.Locale;
import java.util.Scanner;

public class SubString_StringMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = "Samson";

        System.out.println("Name: "+name); // Samson
        System.out.println("Name: "+name.length()); // 6
        System.out.println("Name: "+name.toLowerCase());// Samson
        System.out.println("Name: "+name.toUpperCase());// SAMSON
        System.out.println("Name: "+name.indexOf('s'));// 3
        System.out.println("INdex : " +name.indexOf("ms".toLowerCase()));// 2
        System.out.println("Substring : " +name.substring(3,6)); // son

        System.out.println("Enter name");
        String name5= scan.next();  // yoonis
        System.out.println("Substring13 : " +name5.substring(1,3)); // oo
        System.out.println("Substring01 : " +name5.substring(0, name5.length()-5).toUpperCase()
                                + name5.substring(1,name5.length())); // yoonis >> Yoonis


        String lastName = "Jacobs";
        String firstName = "JacoBs";

        System.out.println();

    }
}
