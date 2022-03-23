package day11_if_statement;

public class IfElseExamples {
    public static void main(String[] args) {


        int score = 60;
        if(score >=75){   System.out.println("Passing");}
        else { System.out.println("Failing ");}

        System.out.println( " -------------------------------");

        int year = 2023;
        boolean lockdown= year ==2020 || year ==2021 ; //

        if (lockdown)  { System.out.println("If LockDown, Stay at home");
            System.out.println("Practice Java ");
            System.out.println("Wear Mask "); }
        else {    // ! not false >> true,,,,,
            System.out.println("if Not lockdown, You are free to come");
            System.out.println("Party ");
            System.out.println("May be travel");}

        // in the situation of the lockdown value is True
    }
}
