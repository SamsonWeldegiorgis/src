package day28_arrayPractice;

import java.util.Arrays;

public class ArraysEntroSaim {
    public static void main(String[] args) {

        // with normal variables

        String cityOne = "Chicago";
        String cityTwo = "New York";
        String cityThree ="Houston";
        String cityFour = "Denver";
        String cityFive = "Pittsburgh";

        // declare array with values

//        String [] cities = new String[5];
         String cities [] = {"Chicago", "New York","Houston", "Denver", "Pittsburgh"};
         String [] cities2 = {cityOne, cityTwo, cityThree, cityFour, cityFive};


        System.out.println("Cities: " +Arrays.toString(cities));
        System.out.println("Cities2: " +Arrays.toString(cities2));
        System.out.println("Length: " + cities.length);

        // how to access each element in the array
        System.out.println("---------");

        System.out.print(cities[0]+",");
        System.out.println(cities[1]+" ");
        System.out.print(cities[2]+",");
        System.out.print(cities[3]+",");
        System.out.println(cities[4]+" ");

        System.out.println("Reverse orders of the cities: "+ cities[4]+","+cities[3]
                +","+cities[2]+","+cities[1]+","+cities[0]);


        System.out.println(Arrays.toString(cities));


    }
}
