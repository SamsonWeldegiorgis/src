package day28_arrayPractice;

import java.util.Scanner;
/*
get the average of the numbers
 */

public class AverageofSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

//    double [] temp = {80, 88, 88, 84, 82, 78, 60, 68};
//    System.out.print("" +temps);

        double sum=0;

        for (int i = 0; i <temps.length ; i++) {

            sum+=temps[i];
        }
        System.out.println("Average : " + (sum/temps.length));
    }
}
