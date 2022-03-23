package day30_arraysForEach;

public class RotatedLeftBetter {
    public static void main(String[] args) {

                /*
		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
        int[] a = {7,0,0}; 			 // = > [0,0,7]
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Put the names");
//        String name = input.nextLine();

        int[][] newNumb = {{1, 2, 3}, {17, 12, 10, 8}, {7, 0, 0}};
        for (int[] each : newNumb) {
            for (int i = each.length - 1; i >= 0; i--) {

                System.out.print((each[i]) + " ");
            }
            System.out.println();

        }
    }
}