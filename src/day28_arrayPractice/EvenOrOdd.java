package day28_arrayPractice;

public class EvenOrOdd {
    public static void main(String[] args) {
        /*
          Ex:
    Input: [4,1,3,12,5]
    Output: Even: 2
    Odd: 3
         */

        int [] nums = { 4,3,1,12,5,15};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

            // traditionally

//        for (int i = 0; i <nums.length ; i++) {
//            if (nums[i] % 2 == 0) {
//                even++;
//                evenNums += nums[i] + " ";
////
//            } else {
//                odd++;
//                oddNums += nums[i] + " ";
//            }
//        }
//            System.out.println("Even Counter: " + even);
//            System.out.println("Even Numbers: " + evenNums);
//
//            System.out.println("Odd Counter : " + odd);
//            System.out.println("Odd Numbers: "+ oddNums);
//        }
//
//    }
            //for each
                for (int number : nums) {
                    if (number % 2 == 0) {
                        even++;
                        evenNums += number + " ";
                    } else {
                        odd++;
                        oddNums += number + " ";
                    }
                }
                System.out.println("Even Counter: " + even);
                System.out.println("Even Numbers: " + evenNums);

                System.out.println("Odd Counter : " + odd);
                System.out.println("Odd Numbers: " + oddNums);

            }}