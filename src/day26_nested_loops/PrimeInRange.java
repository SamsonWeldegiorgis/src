package day26_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {
        /*
        	Input: 50   =    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
         */
        int num = 0;
        String str="";
        String str1="";
        while (num++ < 20) {
            if (num % 2 == 0) {
                str+=" "+num;

            }
        }
        System.out.print(str.trim());

        System.out.println();
        int num1 = 0;
        while (num1++ < 20) {
            if (num1 % 2 == 1) {
                str1+=" "+num1;
            }
        }
        System.out.print(str1.trim());
    }
}


