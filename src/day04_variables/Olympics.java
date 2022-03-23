package day04_variables;

public class Olympics {


        /*
            Class nam Olympics
            create a variable for the year
            print the country and year for the next couple events
            reassign year value each time. Country name is hard coded( difficult to change)
            data :
                China 2022
                France 2024
                Italy 2026
              Look forward to the year $year fo the Olympics to be in $location
         */


    public static void main(String[] args) {
        int year ;
        System.out.println(" \nThe Olympic will be in these locations for the coming years:\n" );

         year =2022;
//        System.out.println(" The olympics will be in China by : "+year );
        System.out.println(" Look forward to the year "+year+ " for the olympics to be in China." );

        year =2024;
//        System.out.println(" The olympics will be in France by:"+year );
        System.out.println(" Look forward to the year "+year+ " for the olympics to be in France." );

        year =2026;
//        System.out.println(" The olympics will be in Italy by :"+year );
        System.out.println(" Look forward to the year "+year+ " for the olympics to be in Italy." );


    }
}
