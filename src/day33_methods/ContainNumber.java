package day33_methods;

/*
ex: input  ({1,2,3,4,}4 ...true,,,,,,output ({1,2,3,4},7 ) - false
 */
public class ContainNumber {

    public static void newNumber (int [] arr, int num){
        boolean result = false;

        for (int each : arr){
            if (each == num){
                result=true;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int []  a = {1,2,3,4};
        int []  intArr = {1,6,3,2};


        newNumber(a, 4);
        newNumber(intArr, 7);
    }
}
