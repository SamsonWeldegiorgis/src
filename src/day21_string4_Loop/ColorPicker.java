package day21_string4_Loop;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        /*
        you are working on some art piece , pick some colors
        flow : ask for a color and get 3 unique colors by the end
         */


        Scanner input = new Scanner(System.in);

            int attempt = 0 ;
            String uniColor = "" ;

            while (attempt<3){
                System.out.println("Enter the color");
                String color = input.nextLine();

                if (uniColor.contains(color)){
                    System.out.println("Put other color");
                }else{
                    uniColor+= color+ " ";
                    attempt++;
                }

            }  System.out.println(uniColor+" : are the unique colors");



    }
}
