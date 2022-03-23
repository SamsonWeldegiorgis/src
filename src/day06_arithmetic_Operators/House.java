package day06_arithmetic_Operators;


public class House {
    public static void main(String[] args) {


            String houseType = "Villa";
            int bedRooms = 3;
            int bathRooms = 3;
            int numberOfKitchen = 4;
            boolean basement = true;
            boolean attic = true;
            boolean houseForSale = false;
            int costOfHouse = 1_500_000;
            String address = "16720 6th Ave West , Lynnwood, WA ";
            String zipCode = "98037";
            boolean parkAvailableNear = true;
            int rateOfSurroundingSchoolDisctrict = 6;


            System.out.println("\n I want to build " + houseType + " with " + bedRooms + " bed rooms, " + bathRooms +
                    " bathrooms, " + numberOfKitchen + " kitchen.\nIt will include basement " + basement + " attic " + attic + " . The house " +
                    " for sale is " + houseForSale + ". \nIt will cost " + costOfHouse + " and the address is " + address +
                    "\n zip code is " + zipCode + " . It has parking availability near us " + parkAvailableNear +
                    " \nand the rate of the school district of our surrounding is " + rateOfSurroundingSchoolDisctrict);


            System.out.println("------------------------------------------------------------");

            String brand = " Apple";
            int processor = 256;
            byte ramMemory = 8;
            boolean hasMonitors = true;
            int numberMonitor = 2;
            boolean hasWifiCard = true;
            String description = "HERO";
            int price = 2_500;
            boolean cpu = false;
            String color = "Blue";
            int numberOfUsbSlots = 3;
            int hasUsb = 5;


        System.out.println("My mobile is an "+brand+" brand with a processor of "+processor+ "GB and ram memory of "+ramMemory+
                "\nIt has monitorts "+ hasMonitors+ " wifi "+ hasWifiCard+ " cpu " +cpu + " with "+numberMonitor+
                " number of monitors. \nIt has a description " + description + " with a price of $"+ price+
                " and with "+ color+ " colour." +
                "\nIt has "+numberOfUsbSlots+ " numbers of slots and " +hasUsb+" usbs.");
//
        System.out.println("----------------------------------------------------------------------------");
//
//        ///////////////////////CORRECTIONS  //////////////////////////////////////
//
//
        String housetype = "Penthouse";
        int numberofbedrooms = 4;
        int numberofbathrooms = 3;
        int numberofKitchens = 2;
        boolean hasBasement = false;
        boolean hasAttic= false;
        boolean hasPool = true;
        boolean isOnSale = false;
        double costOfhouse =1_000_000.99; // 4.5 ....underscore makes the number READABLE
        String address1= "129481 Central Park";
        int zipcode = 219124;
        boolean hasPark= true;
        double schoolRating=4.6;

        String houseInfo = "\nThe " +housetype+ " on " + address1+ ", "+ zipcode+ " costs $"
                + costOfhouse + "\nThe " + housetype+ " has " +numberofbedrooms+ " bedrooms, " + numberofbathrooms +
                " bathrooms, "+ numberofKitchens+ " kitchen\n. It also includes a basement "+hasBasement+
                ", has an attic: " +hasAttic+ " ,\nhas a pool: "+hasPool+ " and is on sale: "+ isOnSale+
                " and has a park: "+hasPark+".\nThe schools in the area have a rating of "+ schoolRating;

        System.out.println(houseInfo);


        System.out.println("----------------------------------------------------------------------------");

        //////////////////MAKING THE SETTING SIMPLER  ///////////////////////

        String housetype4 = "Penthouse", address4= "129481 Central Park";
        int numberofbedrooms4 = 4, numberofbathrooms4 = 3, numberofKitchens4 = 2 ,zipcode4 = 219124;
        boolean hasBasement4 = false, hasAttic4= false , hasPool4 = true , isOnSale4 = false , hasPark4= true;
        double costOfhouse4 =1_000_000.99  /* READABLE */ , schoolRating4=4.6;

        String houseInfo4 = "\nThe " +housetype4+ " on " + address4+ ", "+ zipcode4+ " costs $"
                + costOfhouse4 + "\nThe " + housetype4+ " has " +numberofbedrooms4+ " bedrooms, " + numberofbathrooms4 +
                " bathrooms, "+ numberofKitchens4+ " kitchen\n. It also includes a basement "+hasBasement4+
                ", has an attic: " +hasAttic4+ " ,\nhas a pool: "+hasPool4+ " and is on sale: "+ isOnSale4+
                " and has a park: "+hasPark4+".\nThe schools in the area have a rating of "+ schoolRating4;

        System.out.println(houseInfo);







    }
    }
