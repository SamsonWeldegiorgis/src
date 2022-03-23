package day24_loopExample2;

public class CountChars {
    public static void main(String[] args) {
        /*
        Given string, find and print how many uppercase letter, lowercase letter and numbers
        ex: 2jump41EEkd4s4  ......output : 3- uppercase letters,,,,6 lower case letter,,,5 numbers
         */

//        String str = "2jump41EEkd4s4";
//        int upperCase = 0;
//        int lowerCase = 0;
//        int number = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char letter = str.charAt(i);
//            if (letter >= 'A' && letter <= 'Z') { // get the character at the index number for this
//                // iteration, and stores into the variable letter for re-usability
//                upperCase++; // keep and store it
//            } else if (letter >= 'a' && letter <= 'z') {
//                lowerCase++; // keep and store it
//            } else if (letter >= '0' && letter <= '9') {
//                number++; // keep and store it
//            }
//        }
//        System.out.println("Upper case: " + upperCase);
//        System.out.println("Lower case: " + lowerCase);
//        System.out.println("Numbers: " + number);


        String str = "Copyright © 2022 Market Traders Institute\n" +
                "3900 Millenia Blvd Orlando, Fl, 32839\n" +
                "International: 407.585.2417 USA & Canada: 866.787.8558";

        int upper   =0;
        int lower   =0;
        int number  =0;
        int bracket =0;

        for (int i=0 ;i < str.length();i++){
            char code = str.charAt(i);

            if (code >='A' && code <='Z'){
                upper++;
            }else if (code >='a' && code <='z'){
                lower++;
            }else if (code >='0' && code >='9'){
                number++;
            }
        }
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Number: " + number);


    }

}
