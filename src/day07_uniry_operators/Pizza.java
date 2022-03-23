package day07_uniry_operators;

public class Pizza {
    public static void main ( String [] args) {

    String typeOfPizza= " Cheese";
    int numberOfSlices = 8;
    int numberOfPeople = 4;
    int slicesPerPerson = numberOfSlices / numberOfPeople;  // 8/4 = 2
    int slicesLeftOver = numberOfSlices % numberOfPeople ;  // 8%4 = 0;

        String report = " We ordered "+typeOfPizza+ " pizza with "
                +numberOfSlices+ "  slices, " + numberOfPeople+ " people ate "
            + slicesPerPerson+ " slices each with " + slicesLeftOver+ " left over.";

        System.out.println( "\nReport :" + report );




    }
}
