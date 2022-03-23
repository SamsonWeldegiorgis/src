package day05_Variables2;


public class House {
    public static void main(String[] args) {
        String houseType = "Villa";
        int bedRooms = 3;
        int bathRooms = 3;
        int numberOfKitchen = 4;
        boolean basement = true;
        boolean attic= true;
        boolean houseForSale = false;
        int costOfHouse = 1_500_000;
        String address= "16720 6th Ave West , Lynnwood, WA ";
        String zipCode = "98037";
        boolean parkAvailableNear = true;
        int rateOfSurroundingSchoolDisctrict = 6;


        System.out.println("\n I want to build " +houseType+ " with "+bedRooms+" bed rooms, "+bathRooms+
                " bathrooms, "+numberOfKitchen+" kitchen.\nIt will include basement "+ basement+" attic "+attic+" . The house " +
                " for sale is "+houseForSale+". \nIt will cost " +costOfHouse+" and the address is "+address+
                        "\n zip code is " +zipCode+" . It has parking availability near us "+parkAvailableNear+
                " \nand the rate of the school district of our surrounding is " +rateOfSurroundingSchoolDisctrict );


        System.out.println("------------------------------------------------------------");

        String brand = " Apple";
        int processor = 256;
        byte ramMemory = 8;
        boolean hasMonitors= true;
        int numberMonitor = 2;
        boolean hasWifiCard = true;
        String description = "HERO";
        int price =2_500;
        boolean cpu= false;
        String color = "Blue";
        int numberOfUsbSlots = 3;
        int hasUsb = 5;

        System.out.println("My mobile is an "+brand+" brand with a processor of "+processor+ "GB and ram memory of "+ramMemory+
                "\nIt has monitorts "+ hasMonitors+ " wifi "+ hasWifiCard+ " cpu " +cpu + " with "+numberMonitor+
                        " number of monitors. \nIt has a description " + description + " with a price of $"+ price+
                " and with "+ color+ " colour." +
                "\nIt has "+numberOfUsbSlots+ " numbers of slots and " +hasUsb+" usbs.");


        System.out.println(" -------------------------------------------------------------------");

        String sentence = "Text processing is hard!";
        int position = sentence.indexOf("hard");
        System.out.println(sentence);
        System.out.println("012345678901234567890123");
        System.out.println("The word \"hard\" starts at index "
                + position);
        sentence = sentence.substring(0, position) + "easy!";
        sentence = sentence.toUpperCase();
        System.out.println("The changed string is:");
        System.out.println(sentence);



    }
}
