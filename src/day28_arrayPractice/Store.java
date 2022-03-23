package day28_arrayPractice;



import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

//        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods","IPad"  };
        // do we have jackets in stock ?

        // use scanner to ask which item they are looking for, and check if we have it

//        Scanner input = new Scanner(System.in);
//        System.out.println("What do you want to buy");
//        String items = input.nextLine(); // jacket

        boolean hasJacket = false;

        String [] items = {"Shoes", "Jacket", "Gloves", "Airpods","IPad"  };

        for (int i=0 ; i < items.length; i++){
            if (items[i].equalsIgnoreCase("Jacket") ){
                hasJacket=true;
                break;
            }

        }
//        System.out.println(hasJacket  ? "Jackets in stock" : "Jackets out of stock");
         if(hasJacket){  System.out.println("in stock");
            }else {      System.out.println("out of stock");
    }

}}
