package day33_methods;

public class EvenOdd {
    public static void main(String[] args) {
        oddNumbers(100);
        System.out.println();
        eveNumbers(100);


    }
    public static void oddNumbers (int number) {
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void eveNumbers(int number){
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");


            }}}}

