package day19_stringExamples2;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        /*
        ask the user enter a url, find and print the website from the url

        assume your url always starts with www & assuming your url always ends with .com
        www.google.com
           .>>> google
         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your url");
        String url= input.nextLine();  // www.google.com   // 012345678910

        String website = url.substring(4,10);  //
        String website1 = url.substring(4, url.length()-4);
        System.out.println("substring(4,10): " +website);   // url.substring (4,10); doesn't work for all inputs, b/s 10 is hardcoded
        System.out.println(".substring(4, url.length()-4): " +website1);   // url.substring (4,10); doesn't work for all inputs, b/s 10 is hardcoded

        System.out.println("substring(4,10):" + url.substring(3,8)); // Forfunny
        System.out.println("substring(4,10):" + url.substring(3, url.length() -1)); // Forfunny


    }
}
