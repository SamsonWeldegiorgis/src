package day05_Variables2;

public class CharExamples {
    public static void main(String[] args) {

      // assigning characters to a char type

        char letterOne = 'a';
        char lettertTwo ='Z';
        char numberOne ='9';
        char specialOne='$';

        System.out.println(letterOne);
        System.out.println(lettertTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne+lettertTwo);

        char letterThree1 =65;  // char letterThree= 'A'
        System.out.println(letterThree1);

        //  char letterThree ='65';  // char letterThree= 'A'; this is invalid b/s of 2 characters

        System.out.println(letterOne+lettertTwo + letterThree1
                + numberOne+specialOne); // original : 97 + 90 + 65 + 57 + 36

        System.out.println(letterOne+ " " +lettertTwo+ " " +numberOne+ " "
                + specialOne+ " " +letterThree1); // with double quotations

        System.out.println(letterOne+ "% " +lettertTwo+ " * " +numberOne+ "$ "
                + specialOne+ " - " +letterThree1); //  spaces between each other

        System.out.println("chars : " +letterOne+lettertTwo+ numberOne+
                specialOne+letterThree1); // String in the beginning then the rest becomes string

        System.out.println("" +letterOne+lettertTwo+ numberOne+
                specialOne+letterThree1); // the same answer like the above, just avoiding the char





    }
}
