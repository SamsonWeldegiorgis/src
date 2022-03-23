package day06_arithmetic_Operators;

public class CastingExamples {

    public static void main(String[] args) {
//        short numOne = 40;
//        float numTwo= numOne;
//
//        System.out.println("\nnumOne:" + numOne);
//        System.out.println("numTwo:" + numTwo);
//
//        System.out.println("------------------------");
//
//        float numTwo1 = 100F;
//        short numOne1= (short)numTwo1;
//
//        System.out.println("numOne1:"+ numOne1);
//        System.out.println("numOne:" +numTwo1);
//
//
//        System.out.println("------------------------");
//
//        float num5=30; // 30 is int by default, at it automatically goes up to float.
//        byte num6= (byte)num5;
//
//        System.out.println("num5:"+ num5);
//        System.out.println("num6:"+ num6);
//
//        System.out.println("------------------------");
//
//        char letter = 'A';
//        int letter2= letter;
//
//        System.out.println(" letter:" +letter);
//        System.out.println("Letter2 : "+letter2);
//        System.out.println("Letter2 Int  : "+(int)letter2);
//        System.out.println(" Char 66  : "+(char)66); //B
//        System.out.println("int ' '   : "+(int)' '); // 32
//        System.out.println("int '&' : "+(int)'&'); // 38
//        System.out.println("int ' Z'   : "+(int) 'Z'); // 90
//        System.out.println("int 'z' : "+(int)'z'); // 122
//        System.out.println("int ' F'   : "+(int) 'F'); // 70
//        System.out.println("int 'f' : "+(int)'f'); // 102
//
//        byte score = 5;
//        byte score1 = 6;
//
////        byte calculate = score+score1; 11
//
//        byte calculate = (byte)(score+score1);
//        System.out.println( calculate); // 11
//
//        int calculate4 = (score+score1);
//        System.out.println(calculate4);

//         String   movieName  =  "Spider-Man";
//         String releaseDate = " 12/17/2021";
//         String genre = "Action/Adventure" ;
//        int  rottenTomatoesRating = 97 ;
//        String  named= " PG-13" ;
//        double  duration =  2.5 ;
//        boolean  isSequel =  true;
//        boolean isOnDvd  =  false  ;
//
//        System.out.println("------ Welcome to the Cinema ------");
//        System.out.println("Tonight we are streaming " + movieName + " which was released on " + releaseDate+ ".");
//        System.out.println("This " + genre+ " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes.");
//        System.out.println("The rating is" + named + " and it runs for " + duration + " hours.");
//        System.out.println("This is a sequel " + isSequel + " and is on dvd " + isOnDvd + ".");


        System.out.println("-----------------------------------------");

        short score = 50;
        byte byte1= (byte)score;

        byte byte2=80;
        short score2= byte2;

        System.out.println(" Short :" + score );
        System.out.println(" Byte :" + byte1);

        System.out.println(" Byte2 :" + byte2);
        System.out.println(" Byte2Short :" + score2);


        System.out.println("-----------------------------------------");

        float grade = 50.5F;
        double success = grade;

        double success1 = 200.50;
        float grade1=(float) success1;

        System.out.println(" Float :" + grade );
        System.out.println(" Double :" + success);
        System.out.println(" Double :" + grade1);

        System.out.println(" Double :" + success1);
        System.out.println(" Float :" + grade1);


        System.out.println("-----------------------------------------");

        int number1= 1000;
        double play1 =number1;

        double play= 500;
        int number = (int)play;

        System.out.println(" Int  :" + number1 );
        System.out.println(" Double  :" + play1);

        System.out.println(" Double :" + play);
        System.out.println(" Int  :" + play);

        System.out.println("-----------------------------------------");

        int balance = 900;
        long distance = balance ;


        long distace1 = 1000;
        int balance1  =(int) distace1;



        System.out.println(" Int  :" + balance );
        System.out.println(" Long  :" + distance);

        System.out.println(" Long :" + distace1);
        System.out.println(" INt :" + distance);


        byte score5 = 5;
        short average = 15;

        System.out.println(score5*average);

        System.out.println(" ----------------------------------------");

        double decimal = 200000;
        double decimal2 = 0.15;

        System.out.println("Decimal : " + (double)decimal/decimal2);
        System.out.println("Decimal2 : " + decimal2);
        System.out.println("Integer : " + (int)(decimal));
        System.out.println(decimal+decimal*decimal2);

        System.out.println( decimal+ " Employee information"+ " we have arragnedec ");


    }
}
