package day15_switch;

import java.util.Scanner;

public class HotelParty {
    public static void main(String[] args) {
        /*

Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room
         */

        Scanner input = new Scanner(System.in);
//        System.out.println("What type of room do you choose : Single, Double, Large or Suite");
//        String typeOfBed = input.nextLine();
        System.out.println("\nHow many days they will stay at the hotel:");
        int stayDays = input.nextInt();
        System.out.println("How many people are staying in the room:");
        int peopleStaying = input.nextInt();
        input.nextLine();

        int partysize = 0;
        double price = 0;
        String roomType = "";
        boolean isValid = true;

        switch (peopleStaying) {
            case 1:
                partysize = 1;
                roomType = "single room";
                price = stayDays * 100;
                break;

            case 2:
                partysize = 2;
                roomType = "Double room";
                price = stayDays * 125;
                break;

            case 3:
            case 4:
                partysize = 1;
                roomType = "Large room";
                price = stayDays * 125;
                break;

            case 5:
            case 6:
            case 7:
                partysize = 1;
                roomType = "Suite";
                price = stayDays * 5000;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                isValid = false;

        }
        if (isValid) {
            System.out.println("Party Size: " + partysize);
            System.out.println("Room Type : " + roomType);
            System.out.println("The price is :" + price);
        }
    }
}
