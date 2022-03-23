package day05_Variables2;

public class CellPhone {

        /* create a class cell phone
           create a main method
           declare and assign these variables :
                brand, model, color, price, storage, hasCamera, sim( char A, B,C )

           Print all the variables :
                sample data : apple, iphone 10, black , 1000.99, 128, true, A

         */
        public static void main(String[] args) {

                String brand = " Apple";
                String model = "Iphone10";
                String color = " yellow" ;
                double price = 1000.99;
                int storage = 128;
                boolean hasCamera = true;
                boolean simCard= false;
                char simCard1='A';
                char simCard2 = 'B';
                char simCard3= 'C';

                System.out.println("My phone \"brand\" :    " + brand);
                System.out.println("My phone \"model\" :     "  + model);
                System.out.println("My phone \"color\" :    " + color);
                System.out.println("My phone \"price\" :     "  + price);
                System.out.println("My phone \"storage\" :    " + storage);
                System.out.println("My phone \"has Camera\" : " + hasCamera);
                System.out.println("My phone \"simcard is\" : " + simCard1);

                System.out.println("\n I have an " +model+ " from" + brand);
                System.out.println("It came in the color" + color+ " and it has a storage of " + storage+"GB.");
                System.out.println(" For the sim type " + simCard1 +" "+ simCard + " and the total price is " +price);

                        // approach 2 with String variable :

                String fullMessage = " \n I have an " + model + " from " + brand +"\nIt came in the color"
                                + color + " \nand it has " + storage + "sim type " + simCard + " with a camera " + hasCamera
                        + " \nthe total price was $" + price;

                System.out.println( fullMessage);
                System.out.println(fullMessage);

//                { for ( int i=0; i<3;  i++)
//                        System.out.println(fullMessage);}



         }
}
