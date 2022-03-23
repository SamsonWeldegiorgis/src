package day28_arrayPractice;

public class ForEachLoopExamples {
    public static void main(String[] args) {

        int [] nums = {30,12,159,12};
        //iterate traditionally
        for (int i=0; i<nums.length; i++){
            System.out.println("Traditionaly :" + nums[i]);
        }
        System.out.println();

        //iterate for Each
        for(int element : nums){
            System.out.println("For each:" + element);
        }

        System.out.println();
        // String examples

        String[] classes = {"Java", "Soft skills" , "Selenium", "Database", "API"};

        for (int i=0; i<classes.length; i++) {
            System.out.println("Traditionaly :" + classes[i]); // traditionally

        }

        System.out.println();
        for (String word : classes){
            System.out.println("For each: " + word);  // for each
        }
        System.out.println();
        // double examples

        double [] prices = {10.4,40.2,410.2};
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Traditionally : $" + prices[i]);

        }
        System.out.println();
        for ( double cost: prices){
            System.out.println("For each: $" + cost );

        }
        }
        }






