package day19_stringExamples2;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        /*
        ask the user to enter 3 String inputs.
        Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used
to check for any character.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter 3 words: ");
        String word1 =  input.nextLine();
        String word2 = input.nextLine();
        String word3 = input.nextLine();  // make in if , switch, boolean, nested

        int oneLen = word1.length();   // apple
        int twoLen = word2.length();    //  java
        int threeLen = word3.length();   //

        String longestWord = " ";  // apple

        //for longest word that contains "a" from all  /  "" is the biggest with a
                                       // 5            //
        if (word1.contains("a") && word1.length() > longestWord.length() ) {
          longestWord= word1;
        }  if (word2.contains("a") && word2.length() > longestWord.length()){
            longestWord= word2;
        }  if (word3.contains("a") && word3.length() > longestWord.length()) {
            longestWord= word3;
        }
        System.out.println(longestWord.isEmpty() ? "No single largest word with a"
                : longestWord + " is the longest word with a"); // if (longestWord.isEmpty() sout   " No single,,,,"
                                                               // else longestWord is the longest,,,,
        }


//        //for longest words of the word
//
//        if (word1.length() > word2.length() && word1.length() > word3.length()){
//            System.out.println(word1 + " is the longest word");
//
//        } else if (word2.length() > word3.length()){
//            System.out.println(word2+" is the longest");
//        } else {
//            System.out.println(word3+ " is the longest");
//        }

    }

