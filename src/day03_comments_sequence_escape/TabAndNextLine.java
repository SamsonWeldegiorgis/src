package day03_comments_sequence_escape;

public class TabAndNextLine {
        public static void main ( String [] args) {

            System.out.println( " My name starts with \"S\"");

            System.out.println(" I like to be there always. \n However because of you I will stay more ! ");

            System.out.println(" \t This was tabbed once ");

            System.out.println(" \t\t\t\t This was tabbed twice .");

            System.out.println("                 This was tabbed twice .");


            // examples of next lines

            System.out.println();
            System.out.println("1) Go to store ");
            System.out.println("2) Grab milk");
            System.out.println("3) Wash the car");

            System.out.println();

            System.out.println(" \n 1)Go to store \n 2) Grab milk \n 3) wash the car ! ");

            System.out.println();
            System.out.println(" \n 1)Go to store \t 2) Grab milk \t 3) wash the car ! ");


            System.out.println();
            System.out.println(" \n 1)GO TO STORE \n 2) GRAB MILK \n 3) WASH THE CAR ! " +
                    "\n Above all I want  \" WASHING THE CAR \"");



            System.out.println();

            System.out.print("1) Go to store ");
            System.out.print(" 2) Grab milk");
            System.out.print(" 3) Wash the car");


        }
}
