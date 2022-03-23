package day28_arrayPractice;

import java.util.Arrays;

public class Store12 {
    public static void main(String[] args) {

        String [] items = { "Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double [] prices = { 89.99, 150.0, 999.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };
          // print the catalogue

        for (int i = 0; i <items.length ; i++) {
            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
            System.out.println();
            System.out.println(items[i]);
            System.out.println(itemIds[i]);
            System.out.println(prices[i]);

        }
        System.out.println();
        // Task : Find the index of the Gloves


            int indexOfGloves = -1; // we set -1 as the default, so that if gloves is not found in the array it will always give -1

            for(int i = 0; i < items.length; i++){
                if(items[i].equalsIgnoreCase("gloves")){
                    indexOfGloves = i;
                    break;
                }
            }

            System.out.println("Index of gloves " + indexOfGloves);  // 2


            System.out.println(" ----------------- ");

            // find the most expensive item : // ipad - $439


        double mostExpensive = prices[0]; // default value
        int indexOfMOstExpensive = 0; // default value


        for (int i=0 ; i <prices.length; i++){

            if (prices[i]> mostExpensive ){
                mostExpensive = prices[i];
                indexOfMOstExpensive=i;
            }
           }
        System.out.println("Most Expensive : ");
        System.out.println("Item : " + items[indexOfMOstExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMOstExpensive]);
        System.out.println("Price:  $" + prices[indexOfMOstExpensive]);

    }}

