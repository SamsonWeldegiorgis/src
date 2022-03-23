package day33_methods;
/*
create a method that will print the first element, last element, that will print the elements,,,length matters ...even there is middle, for odd there is one middle.
 */

public class OurArrayClass {


    public static void firstElement(int [] nums) {
        System.out.println("First element: " + nums[0]);
    }
    public static void lastElement(int [] nums) {
        System.out.println("Last element: " + nums[nums.length-1]);
    }public static void middleElement (int [] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("First Middle : " + nums[nums.length / 2 - 1]);
            System.out.println("Second Middle : " + nums[nums.length / 2]);
        } else {
            System.out.println("Middle: " + nums[nums.length / 2]);
        }
       }
       public static void secondMiddle (int [] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("First Middle : " + nums[nums.length / 2 -1]);
        }

        }
    public static void printArray ( int [] nums) {
        String result = "START| ";
        for (int num : nums) {
            result += num + "*";
        }
        result += " |END";
        System.out.println(result);

     }public static void wish(int num){
        System.out.println(num*num);
    }

    public static void main(String[] args) {
        int [] numbers = {50,0,10,500,20,40,124};
        firstElement(numbers);
        middleElement(numbers);
        lastElement(numbers);

        int [] numbers2 = {50,0,10,500,20,40,124,19};
        middleElement (numbers2);
        secondMiddle (numbers2);
//        fmiddle (numbers2);
        printArray(numbers2);
        printArray(new int [] {40,20,10,65});
        wish(40);

    }


}
