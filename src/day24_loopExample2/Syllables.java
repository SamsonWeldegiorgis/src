package day24_loopExample2;

import java.util.Scanner;

public class Syllables {
    public static void main(String[] args) {
        /*
        calculate how many syllables the words EX: ja-va  ,,,,,output : 2
         */

                Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = input.nextLine().trim();

//        String s = "ja-va-script-man-two";
        int syllables = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                syllables++;
            }
        }
        System.out.println("Syllables : " + syllables);


//    int syll = 0;
//    for (int i=0 ; i<s.length(); i++){
//        if ( s.charAt(i) == '-'){
//            syll++;
//        }
//    }
//        System.out.println("syll: "+syll);

}

}
