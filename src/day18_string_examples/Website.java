package day18_string_examples;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        /*

    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

     */


        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the url");
        String url = input.nextLine();
        boolean isValid = true;
        url=url.toLowerCase();


            boolean validStart = url.startsWith("www");
            boolean validEnd = url.endsWith(".com") ||url.endsWith(".edu")
                                || url.endsWith(".gov") || url.endsWith(".net");

        if(validStart && validEnd) {
            System.out.println(url+ " is a valid website");

        }else{
            if (!validStart && isValid)
            System.out.println(url+ " needs to start with www");
        } if (!validEnd && isValid){
            System.out.println(url + " need to end with .com/.org/.gov");
        }




    }

}
