package day20_string_examples3;

public class MiddleChar2 {
    public static void main(String[] args) {

        String s ="apples";   // to get cd,,,,as a middle numbers
                // 012345

        int mid = s.length()/2;
        int len = s.length();

        System.out.println("MID: " + mid); // 3
        System.out.println("LEN: " + len);  // 6

        if (s.length()%2 ==0){       // our word is even length   // length /2 > 6 /2 = 3

            char firstMiddle = s.charAt(len/2 -1 );
            System.out.println("firtMiddle :"+ firstMiddle); // c
            char secondMiddle = s.charAt(len/2);
            System.out.println("firtMiddle :"+firstMiddle); // c

            System.out.println("With charAt: "+ firstMiddle+secondMiddle); //cd
            System.out.println("With substring: " +s.substring(mid-1, mid)); // c
            System.out.println("With substring: " +s.substring(mid-1, mid+1)); //cd

            // our word is odd length                       // 7/2 = 3 ..middle character

            char middle = s.charAt(mid);
            System.out.println("With charAt: " + mid); // 3
            System.out.println("With substring: " +s.substring(mid-1, mid+1)); //cd
        }
}}
