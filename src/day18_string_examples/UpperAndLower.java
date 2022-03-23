package day18_string_examples;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";

        System.out.println("\nsNOw: " + str.toUpperCase());  // "snow"
        System.out.println("sNOw: " + str.toLowerCase());  // "SNOW"
        System.out.println("sNOw: " + str);   // "sNOw"

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println("word: " +word); // hello

        int a = 4 ;              // for primitive we update the value,
        a++ ; // 5
        a+=10;  // 15
        System.out.println("a: " +a); //  15
        String word2= word+ "WORLD";          //  we are making new variables,,,
        System.out.println("word :"+word2);  // helloWORLD
        System.out.println(word); // hello

        word += " new text";  // new String and reassigning to the original
        System.out.println(word); // word = word + "next text "

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println("old: "+old);
        System.out.println("newValue: " +newValue);



    }
}
