package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        /*
            Task :
                declare and assign :
                  is it the weekend
                  are you a teacher
                  are you a policeOfficer
                  are you a firefighter

                  do you get a discount ?
                  Must be a weekend day and you must be one of the given professin


         */


            boolean weekEnd = true ;
            boolean teacher = false;
            boolean policeOfficer = true;
            boolean fireFighter = false;

            boolean getDiscount= weekEnd && (teacher || fireFighter || policeOfficer);

        System.out.println("\nGet Discount : " + getDiscount); //

        System.out.println(" --------------------------");


        boolean weekEnd1 = true;
        boolean teacher1 = false;
        boolean policeOfficer1 = true;
        boolean fireFighter1 = false;

        boolean getDiscount1= weekEnd1 = false && teacher1 && fireFighter1 && policeOfficer1;

        System.out.println("\nGet Discount1 : " + getDiscount1); //



    ;
    }
}
