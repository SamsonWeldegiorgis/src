package day21_string4_Loop;

public class AlphabetLowera_z {
    public static void main(String[] args) {
        /*
        write a program that will print all the alphabet letters in lowercase from
            'a' to 'z' ..lower case

         */
        System.out.println(" -----------------");
//        char c ='a';
//
//        while ( c <= 'z') {
//            System.out.print(c + " ");
//            c++;

            System.out.println(" ------------------");

            // or another option

            char lowerCaseUp = 'a';

            while(lowerCaseUp <='z'){
                System.out.print(lowerCaseUp+ " ");
                lowerCaseUp ++;
       }
        System.out.println(" ----------------------------");
            // Z - A

            char uppercaseBack = 'Z';
            while (uppercaseBack >= 'A'){
                System.out.print(uppercaseBack +  " ");
                uppercaseBack--;
            }

        System.out.println(" ----------------------------");
//        // Z - A
//
//        int i = 122;
//        while (i >= 97){
//            System.out.print(char(i));
//            i--;
        }
        }