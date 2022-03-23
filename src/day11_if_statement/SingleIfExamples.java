package day11_if_statement;

public class SingleIfExamples {
    public static void main(String[] args) {

        if(true) { System.out.println("Hello World");} // if false no print out

        System.out.println("Second Line");

        System.out.println("--------------------"); // just normal prints statement

        if (true) {
            System.out.println("Todsay is Monday ");} // if true = printed
        System.out.println("Third Line");


        int score = 80;
        if(score >=75){   System.out.println("Passing");}
        if (score< 75) {
            System.out.println("Failing ");}

        System.out.println( " -------------------------------");

        int year = 2021;
        boolean lockdown= year ==2020 || year ==2021 ; //

        if (lockdown)  { System.out.println("If LockDown, Stay at home");
            System.out.println("Practice Java ");
            System.out.println("Wear Mask "); }
        if (!lockdown){    // ! not false >> true,,,,,
            System.out.println("if Not lockdown, You are free to come");
            System.out.println("Party ");
            System.out.println("May be travel");}

        // in the situation of the lockdown value is True

        }
}
