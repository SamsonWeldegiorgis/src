package day06_arithmetic_Operators;

public class Pizza {
    public static void main ( String [] args) {

        String typeOfPizza = "Cheese Pizza";
        int numberOfSlices = 8;
        int numberOfPeopleEating = 4;




        System.out.println("\n Each person will get : " +(numberOfSlices/numberOfPeopleEating)+" "+typeOfPizza);

        System.out.println(" Slices left over are:  "+ numberOfSlices%numberOfPeopleEating);

        System.out.println("\n ** We ordered "+typeOfPizza+ " with "+ numberOfSlices+
                    " slices ,"+numberOfPeopleEating +" people ate "+ numberOfSlices/numberOfPeopleEating+ " slices each with "
                    +(numberOfSlices%numberOfPeopleEating)+" left over.");


        System.out.println(" --------------------------------------------------------------");

        String typeOfPizza1 = "Cheese Pizza";
        int numberOfSlices1 = 80;
        int numberOfPeopleEating1 = 9;

        System.out.println("\n Each person will get : " +(numberOfSlices1/numberOfPeopleEating1)+ " "+typeOfPizza1);

        System.out.println(" Slices left over are:  "+ numberOfSlices1%numberOfPeopleEating1);

        System.out.println("\n ** We ordered "+typeOfPizza1+ " with "+ numberOfSlices1+
                " slices ,"+numberOfPeopleEating1 +" people ate "+ numberOfSlices1/numberOfPeopleEating1+ " slices each with "
                +(numberOfSlices1%numberOfPeopleEating1)+" left over.");

    }
}
