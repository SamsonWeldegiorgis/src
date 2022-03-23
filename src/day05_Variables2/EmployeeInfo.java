package day05_Variables2;

public class EmployeeInfo {

                   /* create a class EmployeeInfo
           create a main method
           declare and assign these variables :
                firstName, lastName, gender, age, companyName, are they full time,job title, salary, numberr
                of pto(0-25), are they married , suit ( Char A, B, C, D )

           Print all the variables :


         */

    public static void main(String[] args) {

//        String firstName = "Samson";
//        String lastName = "Weldegiorgis";
//        char gender = 'M';
//        byte age = 39;
//        String companyName = "Amazon";
//        boolean fullTime = true;
//        int salaryOfPto = 20;
//        boolean statusOfMarriage = true;
//        char suit = 'A';
//
//        System.out.println("\n My name is "+ firstName+ " and my last name is "+lastName);
//        System.out.println("My gender type is " + gender+". I am"+age+ "years old." );
//        System.out.println(" I work in "+companyName+" full time "+fullTime);
//        System.out.println(" My salary of pto is "+ salaryOfPto);
//        System.out.println(" I am "+ statusOfMarriage+ " married and I live in suit "+suit);
//


        /////////////////// corrections ////////////

        String firstName , lastName, companyName, jobTitle;
        char gender, suit;
        int age, numberOfPTO ;
        double salary;
        boolean isFullTime, statusOfmarriage;

        firstName = "James";
        lastName = "Bond";
        companyName= "MI6";
        jobTitle= "SpecialAgent";
        gender='M';
        suit = 'D';
        age = 50;
        numberOfPTO=15;
        salary=1_000_000; // we write in normal as 1,000,000 so we use underscore for that;
        isFullTime= true;
        statusOfmarriage = false;

        String fullDetails = "\nEmployement information for "+firstName+" "+lastName+" Gender:"+gender+
                ".\n"+jobTitle + " at " + companyName + ". Currently " + age + " years old." +
                "\n"+companyName+ " is located in suit "+suit+ ".This year's salary comes to $ "
                + salary+"\nOther details : PTO: " + numberOfPTO+" , full time ? "+ isFullTime+ "," +
                " married:" + statusOfmarriage;
        System.out.println(fullDetails);

    }
}
