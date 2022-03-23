package day20_string_examples3;

public class MiddleChar {
    public static void main(String[] args) {
        /*
       Print the middle character of a string  A. if the length of the String is even
       there will eb 2 middle characters
       B. if the length of the string is odd there will be one middle character
       ex:
        input : elephant
        outbput : The middle character : ph
         */

        String s ="abcde"; // to get c,,,,as a middle numbers
                // 01234

        if (s.length()%2 ==0){
            // our word is even length
        }else {
            // our word is odd length                       // 7/2 = 3 ..middle character
            char middle = s.charAt(s.length() / 2);   // length /2 : = 5/2 = 2    // abcdefg
            System.out.println("With charAt: " + middle); //c                     // 1234567
            System.out.println("With substringCenter: "+ s.substring(s.length()/2, s.length()/2+1)); // c
            System.out.println("With sbstgCenter: "+ s.substring(s.length()/2)); // cde
            System.out.println("With substring: "+ s.substring( s.length()/2+1)); // de





        }

    }
}
