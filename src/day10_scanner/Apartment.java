package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        /*
          address , name of owner, number of units, average size of each uni, monthly rent amount, number of washers and driers
          , allows pets or not, has a pool ,length of lease, total number of residents in building , phone number of owner,
          is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning,
          number of parking spaces, has wheelchair access, number of review stars ( out of 5)

          create these variables and use various variables :

            - monthly rent after 3 years ( discount 10% original rent)
            - monthly rent after 6 years ( discount 20% original rent)
            - Average number of residents per unit ( total residents / number of units )
            - Average number of parking spots per unit ( parking spots / units )
            - Average number of units per floor ( units / number of floors )

         */


        Scanner input= new Scanner(System.in);

            // strings
        System.out.println("Please enter the address :");
        String address= input.nextLine();
        System.out.println("Please enter the name of the owner ");
        String nameOfOwner = input.nextLine();
        System.out.println("Please enter " + nameOfOwner+ "'s phone number");
        String ownerPhoneNumber= input.nextLine();
        System.out.println("Please enter the length of the lease");

             // ints
        int lengthOfLease = input.nextInt();
        System.out.println("Please enter the monthly rent :");
        int monthlyRent= input.nextInt();
        System.out.println("Please enter the number of units :");
        int numberOfUnit= input.nextInt();
        System.out.println("Please enter the number of residents :");
        int numberOfResidents= input.nextInt();
        System.out.println("Please enter the number of floor");
        int numberOfFloors= input.nextInt();
        System.out.println("Please enter the number of parking slots ");
        int numberOfParkingSlots= input.nextInt();
        System.out.println("Please enter the number of washers and dryers");
        int numberOfWashersAndDriers= input.nextInt();

            // booleans
        System.out.println("Is the house near gaz station ?");
        boolean isNearGasStation = in.nextBoolean();//
        System.out.println("Does the house include basement ?");
        boolean hasBasement = in.nextBoolean();
        System.out.println("Does the house have available rooms for rent  ?");
        boolean hasAvailableRoomsForRent = in.nextBoolean();
        System.out.println("Does the house include air conditioning  ?");
        boolean hasAirConditioning  = in.nextBoolean();//
        System.out.println("Does the house have wheelchair access  ?");
        boolean hasWheelChiarAccess = in.nextBoolean();
        System.out.println("Does they allow pets");
        boolean allowPets= input.nextBoolean();
        System.out.println("Does the house include pool? ");
        boolean hasPools= input.nextBoolean();
        System.out.println("What is the number of Star Reviews of the house ( 1.0-5.0) ?");
        double numberOfReviewStars = in.nextInt();

            // calculations
        double rateAfter3Years = monthlyRent * 0.9 ;  // rateAfter3Years = monthlyrent - (monthlyrent * 0.1);
        double rateAfter6Years = monthlyRent * 0.8 ;  // rateAfter3Years = monthlyrent - (monthlyrent * 0.2);
        int avgNumberOfResidentsPerUnit = numberOfResidents / numberOfUnit;
        int avgNubmerOfParkingSlotsPerUnit = numberOfParkingSlots/numberOfUnit;
        int avgNumberOfFloorsPerUnit = numberOfFloors/numberOfUnit;



        // Print out


        System.out.println(" \n THE GENERAL INFORMATION OF THE \"STATION 9 \" APARTMENT IS : ");

        System.out.println("\nThe house address : " + address);
        System.out.println("The owner's name is : " +nameOfOwner);
        System.out.println(nameOfOwner+"'s phone number is :"  +ownerPhoneNumber);
        System.out.println("The length of the lease is : " + lengthOfLease+" year.");
        System.out.println("The monthly rent is :"+monthlyRent);
        System.out.println("The number of units are :" + numberOfUnit);
        System.out.println("The number of residents are :" + numberOfResidents);
        System.out.println("The number of floors are :"+ numberOfFloors);
        System.out.println("The number of parking slots are: "+ numberOfParkingSlots);
        System.out.println("The number of washers and dryers is : " + numberOfWashersAndDriers);
        System.out.println("The number of Star Reviews of the house is :" + numberOfReviewStars);

        System.out.println("They allow pets : " + allowPets);
        System.out.println("The house is near gaz station :" + isNearGasStation);
        System.out.println("The house includes basement :" + hasBasement);
        System.out.println("The house includes pool: "+hasPools);
        System.out.println("The house have available rooms for rent :" + hasAvailableRoomsForRent);
        System.out.println("The house includes air conditioning  :" + hasAirConditioning);
        System.out.println("The house have wheelchair access  :" + hasWheelChiarAccess);


         System.out.println("The rate of $"+monthlyRent+" after 3 years will be:$" +rateAfter3Years);
        System.out.println("The rate of $"+monthlyRent+" after 6 years will be:$" +rateAfter6Years);
        System.out.println("The average number of residents " +numberOfResidents+ " per"+ numberOfUnit+ " is: "
                +avgNumberOfResidentsPerUnit);
        System.out.println("The average number of parking slots " +numberOfParkingSlots+ " per "+ numberOfUnit+ " is: "+avgNubmerOfParkingSlotsPerUnit);
        System.out.println("The average number of floors " +numberOfFloors+ " per "+ numberOfUnit+ " " +
                "is:"+ avgNumberOfFloorsPerUnit);



















    }
}
