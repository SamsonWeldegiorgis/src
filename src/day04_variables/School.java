package day04_variables;



public class School {
    public static void main(String[] args) {
           /*
          Task :
                number of students in grade 1 = 50
                number of students in grade 2 = 60
                number of students in grade 3 = 30
                number of students in grade 4 = 38
                number of students in grade 5 = 52

                * make another variable : total number of students in your school

                * number of days in a year (have some half day = 100.5)
                * average gpa in school (3.56) [ ranges 1.0 - 4.0 ]
                * print all of the variables with unique message

          */
//
//        int numberG1 = 50; // we can use int numberOfStudentsInGrade1
//        int numberG2 = 60;//,,,,,,,,....,,, numberOfStudentsInGrade2
//        int numberG3 = 30;//............... numberOfStudentsInGrade3
//        int numberG4 = 38;// ...........numberOfStudentsInGrade4
//        int numberG5 = 52; //........... numberOfStudentsInGrade4
//
//        System.out.println(" The total number of students in our school are :"
//                +(numberG1+numberG2+numberG3+numberG4+numberG5));
//
//        float days = 100.5f;
//
//        System.out.println(" Half of the number of days in the year: " +(days/2));
//
//        double average  = 4.00;
//        double average5 = 3.56;
//        double average2 = 3.00;
//        double average3 = 2.0;
//        double average4 = 1.00;
//
//        System.out.println(" Average GPA is " + average5);


        //////////////CORRECTIONS ////////////////////

        int numberOfStudentnInGrade1 = 30;
        int numberOfStudentnInGrade2 = 25;
        int numberOfStudentnInGrade3 = 34;
        int numberOfStudentnInGrade4 = 19;
        int numberOfStudentnInGrade5 = 28;

        System.out.println("Number of Students in Grade 1 " + numberOfStudentnInGrade1);
        System.out.println("Number of Students in Grade 2 " + numberOfStudentnInGrade2);
        System.out.println("Number of Students in Grade 3 " + numberOfStudentnInGrade3);
        System.out.println("Number of Students in Grade 4 " + numberOfStudentnInGrade4);
        System.out.println("Number of Students in Grade 5 " + numberOfStudentnInGrade5);

        int totalNumberofStudents= numberOfStudentnInGrade1+numberOfStudentnInGrade2+numberOfStudentnInGrade3+numberOfStudentnInGrade4+numberOfStudentnInGrade5;
        System.out.println(" Total number of students : " + totalNumberofStudents);

        double numberOfDaysInYear=101.50;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.6;



        System.out.println("Number Of Days InYear " + numberOfDaysInYear);
        System.out.println("Number Of Snow Days " + numberOfSnowDays);
        System.out.println("Average Gpa In School " + averageGpaInSchool);




    }
}
