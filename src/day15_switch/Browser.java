package day15_switch;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter your browser please:");
        String browser = in.nextLine();
        System.out.println("\nEnter your url please:");
        String url = in.nextLine();

        switch (browser){
             case "chrome":
              case "Chrome":
                System.out.println("\nOpening "+url+" in the chrome browser");
                System.out.println("Loading....");
                break;
            case "Safari" :
            case "safari":
                System.out.println("\nOpening "+url+" in the safari browser");
                System.out.println("Loading ....");
                break;
            case "Firefox":
            case "firefox":
//                browser.equalsIgnoreCase("Firefox");
                System.out.println("\nOpening "+url+" in the Fire Fox");
                System.out.println("Loading ....");
                break;
            default :
                System.out.println("\n"+browser + " is not a valid browser");

        }

    }
}
