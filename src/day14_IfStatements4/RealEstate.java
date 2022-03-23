package day14_IfStatements4;

import java.util.Scanner;

public class RealEstate {
    public static void main(String[] args) {
        /*
             We are buying a house ask the user for their budget (single number, max)

             Extra condition : if the user gives a budget value below 0, it is invalid, so print :
             "That is not a valid budget "
             If the budget is more than 300,000  ,  print " Too much money for this agency "

             Data Based on neighbourhood name :
                name - Hills
                average price - 80,000-100,000
                ratin - 4.0
                gated - no
                allow pet - yes

                name - Highland
                average price - 55,000-75,000
                ratin - 4.0
                gated - no
                allow pet - yes

                name - Oaks
                average price - 120,000-150,000
                rating - 4.5
                gated - Yes
                allow pet - No

                name - Canyon
                average price - 160,000-201,000
                rating - 4.8
                gated - Yes
                allow pet - Yes

                If the budget is no in any range print: "No available houses"

         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your max the value");
//        int budegetValue = input.nextInt();

//        if (budegetValue>= 80_000 && budegetValue<=100_000) {
//            System.out.println(" The name is Hills with rate of 4.0 and gated no allwoing pet- yes");
//        } if (budegetValue>= 55_000 && budegetValue<=75_000) {
//             zSystem.out.println(" The name is Oaks with rate of 3.5 and gated no allwoing pet- yes");
//        } if (budegetValue>= 120_000 && budegetValue<=150_000) {
//            System.out.println(" The name is Highland with rate of 4.5 and gated Yes allwoing pet- No");
//        } if (budegetValue>= 160_000 && budegetValue<=201_000) {
//            System.out.println(" The name is Canyon with rate of 4.0 and gated Yes allwoing pet- Yes");
//        } if (budegetValue>= 300_000) {
//            System.out.println("  Too much money for this agency ");
//        } else {
//            System.out.println("No available houses");
//        }


            //////////////////corrections ///////////////


        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your max the value");
        int budegetValue = input.nextInt();

        String name="" , range="" ;   // default values,,,
        double rating =0 ;
        boolean gated=false, allowPets=false, isAvailable=true;

        if (budegetValue >0 && budegetValue <300_000) {
            System.out.println("\nLooking for a house");

            if (budegetValue >= 55_000 && budegetValue <= 75_000) {
                name = "Hills";
                range = "55_000-75_000";
                rating = 4.0;
                gated = false;
                allowPets = true;
                //               System.out.println("\nHouse Name: "+name+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets :"+allowPets);

            } else if (budegetValue >= 89_000 && budegetValue <= 100_000) {
                name = "Highland";
                range = "89,000-100,000";
                rating = 4.0;
                gated = false;
                allowPets = true;
//                System.out.println("\nHouse Name: "+name+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets :"+allowPets);
            } else if (budegetValue >= 120_000 && budegetValue <= 150_000) {
                name = "Oaks";
                range = "120,000-150,000";
                rating = 4.5;
                gated = true;
                allowPets = true;
                //   System.out.println("\nHouse Name: "+name+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets :"+allowPets);
            } else if (budegetValue >= 160_000 && budegetValue <= 201_000) {
                name = "Canyon";
                range = "160_000-201_000";
                rating = 4.8;
                gated = true;
                allowPets = true;
//                System.out.println("\nHouse Name: "+name+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets :"+allowPets);
            } else {
                System.out.println("No available houses");
                isAvailable = false;
            }

            if (isAvailable) {

                String ad = "\nName of the neighbourhood: " + name + "\nPrice range: " + range
                        + "\nRating: " + rating;

//            ad += "\nGated: " +gated;

                ad += "\nGated: " + (gated ? "Yes" : "No");  // if the gated boolean is true, it will concatenate yes into ad,
                // but if false, it will concatenate No into ad,

                ad += "\nPet Allowed : " + (allowPets ? "They allow pets" : "They don't allow pets");

                System.out.println(ad);


            } else {
                if (budegetValue <= 0) {
                    System.out.println("Your budget cannot be less than 0");
                } else   // you can include the else( budgetValue > 300_0000 inside
                    System.out.println("Too much money for this agency");
            }
        }
    }
}
