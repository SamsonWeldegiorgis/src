package day05_Variables2;

public class RecapVariables {
    public static void main(String[] args) {
        // Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;
/*

            // we can not print the variable b/s they don't have values
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);
//
      */

             numberOfCoffeeCups = 2;
             totalPriceOfCoffee = 10.25;
             totalStudentsInClass= 432;

        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);

        System.out.println(numberOfCoffeeCups+ " # " + totalStudentsInClass);
        System.out.println(numberOfCoffeeCups+ " * " + totalStudentsInClass);
        System.out.println(numberOfCoffeeCups+ " \t " + totalStudentsInClass);

        // Declare and assign

        double temperature =20.6;
        int javaDays=5;

        System.out.println("This is my temperature : " + temperature);
        System.out.println("It is day " + javaDays+ " in java class");





    }
}
