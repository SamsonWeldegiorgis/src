package day30_arraysForEach;

public class SumOfArrays {
    public static void main(String[] args) {

        int [] array= {1,2,2,6,99,99,7,4,6,4,4,5,4};
        int sum=0;
        boolean checkSix=false;

        for(int i=0; i<array.length; i++) {

            if(checkSix) {

                if(array[i]==7) {
                    checkSix=false;
                }
            } else if(array[i]==6) {

                checkSix=true;

            } else {
                sum+=array[i];
            }
        }
        System.out.println(sum);

    }
}


