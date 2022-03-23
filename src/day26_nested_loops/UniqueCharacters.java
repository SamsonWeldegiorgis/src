package day26_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        /*
        input : AAABCCDEEF   ............output : BDF  .. unique & only one char found
                                                // if repeated not selected
         */
        String str = "AAABCCDEEFYZZX";

        for (int i=0; i<str.length(); i++){

            char letter = str.charAt(i);
            int count = 0;

            for (int j=0 ; j<str.length(); j++){

                char inner = str.charAt(j);
                //System.out.println(letter+ " - " + inner);
                if (letter ==inner){
                    count++;
                }

            }if(count==1){ // will be one and unique, the char will match with itself 1 time
                            // so it never be 0, if the counter value is >1 , that char
                            // matched with multiple other characters, it is NOT uniqu
                System.out.print(letter);
            }
//            System.out.println();
        }

//        for (int i=0; i<str.length(); i++){
//            char letter1 =str.charAt(i);
//            int counter1=0;
//
//            for (int j=0; j<str.length(); i++){
//
//                char inner1 =str.charAt(j);
//            if (letter1==inner1){
//                counter1++;
//            }
//        }if (counter1==1){
//
//
//     System.out.print(letter1);
}}
