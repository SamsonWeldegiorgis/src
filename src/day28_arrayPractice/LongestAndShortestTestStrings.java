package day28_arrayPractice;

public class LongestAndShortestTestStrings {
    public static void main(String[] args) {
        /*
         * write that can return shortest string element  // smallest word > java
         * write that can return longest string element   // biggest word  > computer
         */

        String[] strs = {"apple", "java", "guav", "computer", "cat", "water"};
        String smallest = strs[0];
        String biggest = strs[0];

        for (int i = 1; i <strs.length; i++) {

            if(strs[i].length()> biggest.length()){
                biggest = strs[i];

        } if (strs[i].length() < smallest.length()){
                smallest = strs[i];
            }
            }
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);


        System.out.println("  .....................other way");

        for (String word : strs){
            if (word.length() > biggest.length()){
                biggest= word;
            } if (word.length() < smallest.length()){
                 smallest = word;
            }
        }
        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest;: " + smallest);



        System.out.println("  .....................other way");
        String small = strs[0];
        String big = strs[0];

        for (int i = 0; i < strs.length ; i++) {

            if(strs[i].length()> big.length()){
                big = strs[i];
            }if (strs[i].length() < small.length()){
                small= strs[i];
            }


        }
        System.out.println("Big: " + big);
        System.out.println("Small : " + small);


    }}
