package day12_if_Statement2;

public class DayOfWeek {
    public static void main(String[] args) {

        /*
        Declare and assign a number (day)
            1- monday
            2- tuesday
            ..
            7 - sunday
            Print Ex: 2 > tuesday
         */

        int daysOfTheWeek = 4;

        if(daysOfTheWeek==1){
            System.out.println("\nMonday");
        }else if (daysOfTheWeek==2){
            System.out.println("Tuesday");
        }else if (daysOfTheWeek==3){
            System.out.println("Wednesday");
        }else if(daysOfTheWeek==4){
            System.out.println("Thursday");
        }else if (daysOfTheWeek==5){
            System.out.println("Friday");
        }else if (daysOfTheWeek==6){
            System.out.println("Saturday");
        }else if (daysOfTheWeek==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid Day Number!");
        }


        //////////////////// USING ONLY Ifssssss ///////// ( here it checks for each IFs instead of jumping l)

        if(daysOfTheWeek==1){
            System.out.println("\nMonday");
        } if (daysOfTheWeek==2){
            System.out.println("Tuesday");
        } if (daysOfTheWeek==3){
            System.out.println("Wednesday");
        } if(daysOfTheWeek==4){
            System.out.println("Thursday");
        } if (daysOfTheWeek==5){
            System.out.println("Friday");
        } if (daysOfTheWeek==6){
            System.out.println("Saturday");
        }if (daysOfTheWeek==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Invalid Day Number!");
        }

    }
}
