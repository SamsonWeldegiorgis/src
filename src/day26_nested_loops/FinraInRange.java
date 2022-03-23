package day26_nested_loops;

import java.util.Scanner;

public class FinraInRange {
    public static void main(String[] args) {
        /*
        simialar to fizzbuzz ..number %3 > fin   , %5 > ra     both > finra,,,,neither> number
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your stopping point");
        int stop = input.nextInt();

        for (int i =1 ; i< stop ; i++){
            String str ="";

            if (i % 3==0){
                str+="FIN";
            }
            if (i % 5 == 0 ){
                str +="RA";
            }
//            if(str.length(str.equals(" ")))
            System.out.println(str.isEmpty() ? i : str+"-"+i);

        }
    }
}
