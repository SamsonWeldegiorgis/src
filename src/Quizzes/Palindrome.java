package Quizzes;

public class Palindrome {
    public static void palindrome (String str, String reverse){

        for (int i =str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Anagram");
        }else {
            System.out.println("NOt Anagram");
        }
    }

    public static void main(String[] args) {

        String str = "racecar";  // racecar
        String reverse = "";
        palindrome(str, reverse);



        }
}
