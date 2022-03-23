package day07_uniry_operators;

public class ParkingLot {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("\n2 cars drive into the parking lot");
        // approach 1:

        cars = cars + 2;
        System.out.println(cars); // 10+ 2 = 12

        System.out.println("2 more cars drive in");

        // approach 2:
        cars++; // 12
        cars++; // 14
        System.out.println(cars); // 14

        System.out.println("5 cars left");

        cars = cars - 5;
        System.out.println(cars) ; //  14 -5 = 9


    }

}
