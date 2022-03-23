package day30_arraysForEach;

public class SquareNumbers {
    public static void main(String[] args) {

        String [] [] numbers = new String [10][10];
        int num = 1 ;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length; j++) {

                numbers[i][j] = "" + num++;

            }
        }   for (String [] each : numbers){
            System.out.println(String.join(",", each));
        }
    }
}
