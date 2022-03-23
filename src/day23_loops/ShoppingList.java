package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        repeated steps: ask the user to enter the item and add to shopping list
                        at the end show the full shopping list
                        ask the user to add more if they want
         */
        Scanner input = new Scanner(System.in);
        String list = "shopping list:";
        String addMore;

        do {
            System.out.println("Enter the name of the item");
            list+="\n *" + input.nextLine();

            System.out.println("Do you want to add more");
            addMore= input.nextLine(); // yes or no
        }
        while(addMore.equalsIgnoreCase("yes")|| addMore.equalsIgnoreCase("y"));{ // if the user types yes > loop iterates
                                                // if typed any > loop stops
            System.out.println("list: "+list);
        }






    }
}
