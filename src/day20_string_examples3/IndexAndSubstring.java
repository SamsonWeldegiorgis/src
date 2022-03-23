package day20_string_examples3;

import java.util.Scanner;

public class IndexAndSubstring {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separated by commas:");
        String phrase = input.nextLine();

        String word1 = "";
        String word2 = "";
        String word3 = "";

        int firstComma = phrase.indexOf(",");

        if (firstComma >= 0) {
            word1 = phrase.substring(0, firstComma);

//            int secondComma = phrase.indexOf(",", firstComma+1);

            if (firstComma >= 0) {
                word1 = phrase.substring(0, firstComma);
                int secondComma = phrase.indexOf(",", firstComma + 1);
                if (secondComma >= 0) {
                    word2 = phrase.substring(firstComma + 1, secondComma);
                    word3 = phrase.substring(secondComma + 1); // to end

            }
            else {
                word2 = phrase.substring(firstComma + 1); // to end
            }
            } else {
                word1 = phrase;
            }
            word1 = word1.trim();
            word2 = word1.trim();
            word3 = word1.trim();

            System.out.println("word1: " + word1);
            System.out.println("word2: " + word2);
            System.out.println("word3: " + word3);

        }
    }}
