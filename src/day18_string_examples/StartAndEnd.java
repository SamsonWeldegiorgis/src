package day18_string_examples;

public class StartAndEnd {
    public static void main(String[] args) {

        String str = "Apples";

        System.out.println(" Str: "+ str.startsWith("App")); // true = Apples
        System.out.println("StrEnds: " + str.endsWith("app")); // false
        System.out.println(" Str: "+ (str.startsWith("Apples"))); // true

        System.out.println(" -------------------------");

        String s = "A";
        System.out.println(" Str: "+(str.startsWith(s))); // true ( Does the String Str starts with the String S????????
        System.out.println(" Str: "+ (str.startsWith("p"))); // true ( Does the String Str starts with the String S????????

        System.out.println(" -------------------------");

        System.out.println(str.endsWith(" App")); // false ,,, b/s it starts with A
        System.out.println(str.endsWith(     "App")); // true ,,, b/s it starts with A

        System.out.println(" -------------------------");

        System.out.println(str.endsWith("Aoo")); // false ,,, b/s it starts with A        String g = "App";
        System.out.println(str.startsWith("g")); // true ( Does the String Str starts with the String S

        String sentence = "today was a good day";
        System.out.println(" Str: "+( sentence.startsWith("today was a "))); // true

        System.out.println(" StrStarts : "+sentence.endsWith("day")); // true
        System.out.println(" Strends: "+ sentence.endsWith(" day"));  // true
        System.out.println(" StrEnds: "+sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day")); // true

    }
}
