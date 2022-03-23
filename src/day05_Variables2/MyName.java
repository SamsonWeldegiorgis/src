package day05_Variables2;

public class MyName {

    /*
     Create a class MyName
     create a main method
     create multiple char variables, one for each letter of your name
     print your name
        print each letter in a different line
        print your name in the same line
     */

    public static void main(String[] args) {

        char myName1 = 'S';
        char myName2 = 'A';
        char myName3 = 'M';
        char myName4 = 'S';
        char myName5 = 'O';
        char myName6 = 'N';

        System.out.println("\t\t\t" + myName1);
        System.out.println("\t\t\t" +myName2);
        System.out.println("\t\t\t" +myName3);
        System.out.println("\t\t\t" +myName4);
        System.out.println("\t\t\t" +myName5);
        System.out.println("\t\t\t" +myName6);


        System.out.println("\n\tMy Name is : " + myName1+myName2+myName3+myName4+myName5+myName6);

                // or you can make a variable of the name :

        String myName = ""+ myName1+myName2+myName3+myName4+myName5+myName6; // string name = SAMSON
        System.out.println("\tMy name is : " + myName);


    }
}

