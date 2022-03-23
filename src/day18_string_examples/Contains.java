package day18_string_examples;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it is above 70";

        System.out.println(day.contains("it is")); //true
        System.out.println(day.contains("itis")); //false ,,,not a sequence of acharacter
        System.out.println(day.contains("ay it")); //true ...correct sequence
        System.out.println(day.contains("7")); //true ...it has 7
        System.out.println(day.contains("today")); //false  ...not correct upper/lower case
        System.out.println(day.contains("Ti7")); //false  ...not correct sequence
        System.out.println(day.contains("T")); //true  ...it is one of the sentence char





    }
}
