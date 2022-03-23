package day30_arraysForEach;

public class LongestPalindrome {
    public static void main(String[] args) {
        /*    // palindrom = same from biggining to end and end to beginning ,,,,,,
           [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”] ,,,,,,,: No palindrome
         */

        String [] words = {"java", "longer word","civic", "apple","racecar", "mom"};
        String longestPalindrome = "";         //

        for (String eachWord  : words) {  // eachWord == words[i]
//            System.out.println(eachWord);

            boolean isPalidndrome = true;

            // inner loop is iterating thru each String element
            for (int i = 0; i < eachWord.length(); i++) {

                if (eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)) {
                    isPalidndrome = false;
                    break;
                }
            }
            if (isPalidndrome  && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
        }}

