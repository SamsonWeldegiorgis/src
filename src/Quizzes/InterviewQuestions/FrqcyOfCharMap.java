package Quizzes.InterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrqcyOfCharMap {

    public static void main(String[] args) {

        frequencyOfEachChar("apple");
        frequencyOfEachChar("banana");
        frequencyOfEachChar("k0f5da56r");
    }
    public static void frequencyOfEachChar(String str){
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(counter.containsKey(str.charAt(i))){
                counter.put(letter,counter.get(letter)+1); // counter.get() being the method from the map to get the value of the previous counter , then we add 1 to that number..then assigns that result as the new value linked to that key

            }else{
                // map does not contain the letter/char-> which means this is the 1st time the char was found , so we should add it to the map
                counter.put(letter,1);
            }}
        System.out.println(counter);



    }}

