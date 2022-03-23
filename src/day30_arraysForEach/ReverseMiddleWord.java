package day30_arraysForEach;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        /*
        cat eat rat..........reverse the middle word ....../ java always fun,,,,,syawla
         */

        String sentence = "java love fun";
        String [] words = sentence.split (" ");

        String reversed ="";
        char [] middleWord = words[1].toCharArray();


        for (int i = middleWord.length-1 ; i>=0 ; i--){
            reversed+=middleWord[i];

        }
        System.out.println(words[0] + " " + reversed + " " +words[2]);

    }

}
