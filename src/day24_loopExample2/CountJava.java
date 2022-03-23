package day24_loopExample2;

public class CountJava {
    public static void main(String[] args) {
        /*
        java is a language
        0123456789
        java 0, 4 substring   = i , i + 4
        ava  1, 5             = i , i + 4
        va   2, 6             = i , i + 4
        a    3, 7             = i , i + 4
         */
//        String str = "java is java a java language.java most jav";
//        int count = 0;
//
//        for ( int i=0 ; i < str.length()-3; i++){ // i < str.length()-4
//
//            String everyFour= str.substring(i, i+4);
//
//            if (everyFour.equals("java")){
//                count++;
//            }
//        }
//        System.out.println("java :" + count);


        String k = "most people are most most";
        int counter =0;

        for (int i=0; i < k.length()-3 ; i++){

            String fan= k.substring(i,i+4);
         if ( fan.equals("most")){
             counter++;
         }

    }
        System.out.println("most :" + counter);
}}
