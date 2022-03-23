package day11_if_statement;

public class Letter {
    public static void main(String[] args) {
        /*
        create a char variable with a letter (can only do this one hardcoded, no
        Scanner method for char)
        find out if the letter is an uppercase letter or lowercase letter. Print
        the type of letter it is
        ex:
        'b'
        lowercase
        ex:
        'U'
        uppercase
         */

//        char letter= 'x';
//
//        if ( letter =='A' || letter =='B' || letter =='C' || letter =='D' || letter =='E' ||
//                letter =='F' || letter =='G' || letter =='H' || letter =='I' || letter =='J' ||
//                letter =='K' || letter =='L' || letter =='M' || letter =='N' || letter =='O' ||
//                letter =='P' || letter =='Q' || letter =='R' || letter =='S' || letter =='T' ||
//                letter =='U' || letter =='V' || letter =='W' || letter =='X' || letter =='Y' ||
//                letter =='Z' ){
//            System.out.println("\n"+letter+" : is Upper Case");
//        }
//        else { System.out.println("\n"+letter+" : is lower Case"); }



        //////////////////CORRECTION OF SAIM ///////////////

        char letter = 'f';
        if (letter>97 && letter <=122){
            System.out.println("lowercase");
        }

            if ( letter >='a' && letter <='z'){
                System.out.println("lowercase");
            }
            if (letter >='A' && letter<= 'Z') {
                System.out.println("Uppercase");
            } else {
                System.out.println("Invalid Please enter a valid alphabet");
            }
    }
}
