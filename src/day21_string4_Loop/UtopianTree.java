package day21_string4_Loop;

public class UtopianTree {
    public static void main(String[] args) {

        int year =1;
        int growth =1;

        while (year<=3){
            System.out.println("year "+ year+ " - growth 1 cm");
            System.out.println("tree size : "+ growth+ " cm");
            year++;
            growth++;
        }
        growth--;

        while(year <=10){
            System.out.println("year "+ year+ " - growth 2 cm");
            year++;
            growth+=2;
            System.out.println("tree size : "+ growth+ " cm");

        }

    }
}
