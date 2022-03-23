package day08_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {

        /*
        Task;
            declare and assign an age variable
            is the person a kid ( up to 13, include 13)
            is the person senior citizen ( 65 and above )
         */

        int age = 20;

        boolean kisAge = age <=13 ;
        boolean seniorAge = age >=65;

        System.out.println("You are a kid :" + kisAge ); // false 20>13
        System.out.println("You are a senior citizen :" + seniorAge); // false 20<65


        int age1 = 80;

        boolean kisAge1 = age1 <=13 ;
        boolean seniorAge1 = age1 >=65;

        System.out.println("You are a kid1 :" + kisAge1 ); // false 20>13
        System.out.println("You are a senior citizen1 :" + seniorAge1); // true 80<65


        int age2 = 13;

        boolean kisAge2 = age2 <=13 ;
        boolean seniorAge2 = age2 >=65;

        System.out.println("You are a kid2 :" + kisAge2 ); // true 20>13
        System.out.println("You are a senior citizen2 :" + seniorAge2); // true 80<65

    }
}
