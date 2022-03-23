package day26_nested_loops;

public class ExtraDavid {
    public static void main(String[] args) {

//        outer:
//        for(int i = 0; i < 3; i++){
//
//            int count=0;
//        david:
//            for (int j=0; j< 3; j++){
//                System.out.println();
//    }
//}}}


        System.out.println(" -------------------------------------");


//        for(int i = 0; i < 3; System.out.println("david")) {
//
//        int count=0;
//        david:
//        for (int j=0; j< 3; j++){
//        System.out.println();
//
//        }}

        System.out.println(" -------------------------------------");

//        String word = "david";
//
//        for(int i = 0; i < word.length(); i++){  // i<word.length is equal to word.leng()-1
//
//            if(word.charAt(i)=='d' || word.charAt(i)=='a' || word.charAt(i)=='v' ||
//                    word.charAt(i)=='i' ||word.charAt(i)=='d'){
//                System.out.print("" + word.charAt(i));
//
//    }}

//        System.out.println(" -------------------------------------");
//
//        String word = "david";
//        int counter=0;
//
//
//        for(int i = 0; i < word.length(); i++){  // i<word.length is equal to word.leng()-1
//
//            if(word.charAt(i)=='d' || word.charAt(i)=='a' || word.charAt(i)=='v' ||
//                    word.charAt(i)=='i' ||word.charAt(i)=='d'){
//                    counter++;
//
//
//    }}System.out.print(counter);

        System.out.println(" -------------------------------------");

        String word = "david";
        int counter=0;
        String dummy = "";


        for(int i = 0; i < word.length(); i++){  // i<word.length is equal to word.leng()-1

            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' ||
                    word.charAt(i)=='i' ||word.charAt(i)=='d'){
                dummy=dummy+word.charAt(i);
                counter++;
            }
    }
        System.out.println();  // char numbers
        System.out.println("Number of vowels :" +counter);  //

        System.out.println("Vowels in this word: "+dummy);
}}

