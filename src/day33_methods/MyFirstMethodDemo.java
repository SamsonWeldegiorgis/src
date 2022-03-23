package day33_methods;

public class MyFirstMethodDemo {
    public static void main(String[] args) {

        display();
        System.out.println("Be nice always! ");
        System.out.println(" -------- ");
        displayNumber(20);
        System.out.println(" -------- ");
        legibleToVote(23,false);
        System.out.println(" -------- ");
        evenOrOdd(200);

    }

    public static void display() {
        System.out.println("I am coming today");
        System.out.println("My name is Sam");
    }
    public static void displayNumber (int num) {
        System.out.println("The value is: " + num);
    }
    public static void legibleToVote(int age , boolean isCitizen) {
        if (age > 18 && isCitizen) {
            System.out.println("Is legible to vote");
        } else {
            System.out.println("Is not eligible to vote");
        }
    }
        public static void evenOrOdd(int number){
            if(number % 2 ==0){
                System.out.println(number+ " is even number");
            }else{
                System.out.println(number+ " is odd number");

}
}}
