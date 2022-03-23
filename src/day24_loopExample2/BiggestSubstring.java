package day24_loopExample2;

public class BiggestSubstring {
    public static void main(String[] args) {

        /*
        Given string find the biggest substring that match
        ex: aaabbbcccccdddee ,,,,,output : ccccc
         */

        String s = "aaabbbccccddffdeeeeeee";
        String sub = "";  // a a a b b b .....
        String biggest = "";

        for (int i = 0; i < s.length()-1; i++) {

            sub += s.charAt(i);

            if (s.charAt(i) != s.charAt(i + 1)) { // when the character of i is d/t
                // next to it (i + 1)
                if (sub.length() > biggest.length()) {
                    biggest = sub;  // assigns the substring as the new biggest
                }
                sub = " ";  // resets this String for the next substring

            }
        }
        System.out.println(biggest);
    }
}
