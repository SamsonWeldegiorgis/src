package day20_string_examples3;

import java.util.Scanner;

public class JavaStarting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if ((word.indexOf("j") == 0 || word.indexOf("j") == 1) && word.contains("java")) {
            System.out.println("true");
        } else {
            System.out.println("false");
    }}
}
