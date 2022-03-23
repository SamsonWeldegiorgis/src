package day05_Variables2;

public class Tasks {
    public static void main(String[] args) {

        /////////////////Task -1 ////////////////////////////

        boolean b1,b2; // legal declaration
        String s1= "1", s2; // legal declaration
//        double d1,double d2;   // illegal declaration
        double d1; double d2;  // correcte one ( semi-colon)
        int i1; int i2; // legal declaration
//        int i3; i4; // this is illegal declaration
        int i3; int i4; // corrected one ( add dataType )




        /////////////////Task -2 ////////////////////////////


        int score = 2;
        boolean grade = true;
        String marriage = "Married";

        System.out.println("Score : " + score);
        System.out.println("Grade  : " +grade);
        System.out.println("Marriage: " +marriage);


        /////////////////Task -3 ////////////////////////////

        int price = 10;
        float score1 = 12.5F;
        String level = "Java Programming";

        System.out.println("\n Price :"  + price);
        System.out.println(" Score  :"  + score1);
        System.out.println(" Level  :"  + level);


        /////////////////Task -4 ////////////////////////////

        String name= " IN 1491 COLUMBUS SAILED THE OCEANBLUE.";
        int year = 1492;

        System.out.println("\n" + name);
        System.out.println("In "+year+" COLUMBUS SAILED THE OCEANBLUE.");

        /////////////////Task -5 ////////////////////////////

        char numberOfChildren='N';
        String parentsName = "Z";
        String geographicLocation = "Y";
        String jobTitle = "X";

        System.out.println( "\nYou will be a "+jobTitle+" in "+geographicLocation +
                ",and married to "+parentsName+ " with "+numberOfChildren+ " kids.");



        /////////////////Task -6 ////////////////////////////

        int month =5;
        int day =20;
        int year1 = 2019;

        System.out.println(" \nThe date of today is : "+month+"/"+day+"/"+year1);


        /////////////////Task -7 ////////////////////////////

        int i = 100 ;

        System.out.println("i=\n"+i);
        i = 10;

        System.out.println("i=\n"+ i);


        /////////////////Task -8 ////////////////////////////

        int i5;
        int n;

        n=100;
        i5=n;

        System.out.println("\ni:"+i5);
        System.out.println("n:"+n);


        /////////////////Task -9 ////////////////////////////

        int a, b,c;

        a=10;
        b=20;
        c=a;
        a=b;

        System.out.println("\na:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);




















    }
}
