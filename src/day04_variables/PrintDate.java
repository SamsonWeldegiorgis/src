package day04_variables;

public class PrintDate {
    public static void main(String[] args) {
        /*
        Tasks :
            declare and assing 3 variables
            the month number, the day number, and year number

            print the date in the following format:
                month/day/year
         */


        System.out.println( " Put the month,day and year you were born:");

        int month=10;
        int day= 3;
        int year = 1981;

        System.out.println( " I was born on " +month+"/"+ day+ "/"+year);

        System.out.println();

        System.out.println( " Put today's date:");
            month = 2;
            day = 5;
            year = 2022;

        System.out.println(" Today's date is : " +month+"/"+day+"/"+year);
        System.out.println(" Today's date is : " +month+"-"+day+"-"+year);
        System.out.println(" Today's date is : " +month+"|"+day+"|"+year);
        System.out.println(" Today's date is : " +month+"<>"+day+"<>"+year);

        /*
            Class nam Olympics
            create a variable for the year
            print the country and year for the next couple events
            reassign year value each time. Country name is hard coded
            data :
                China 2022
                France 2024
                Italy 2026
              Look forward to the year $year fo the Olympics to be in $location
         */


    }
}
