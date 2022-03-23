package day28_arrayPractice;

public class LoopArrayExamples {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        String [] fruits = {"Orange","Banana","Apple","Strawberry","Lemon","Grape"};

        for (int i = 0; i <= fruits.length - 1; i++) {
            System.out.println(fruits[i]);  //  straight
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);  //  straight

        }
        System.out.println();

        for (int i = fruits.length-1; i >= 0; i--) {
            System.out.println(fruits[i]);   // back wards
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);   // back wards
    }
}}
