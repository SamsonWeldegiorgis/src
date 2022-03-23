package day28_arrayPractice;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        System.out.println(" ----Int-------------------------------");

       int numbers [] = new int[3];
        numbers [0] = 19;
        numbers [1] = 59;
        numbers [2] = 30;

        System.out.println(Arrays.toString(numbers) );

        System.out.println(" ------String-----------------------------");
        String colors [] = {"Blue", "Yellow","Green"};

        System.out.println("THe length is: " + colors.length);
        System.out.println("The colors are  :"+ Arrays.toString(colors));

        System.out.println(" -----toString()------------------------------");
        String [] names = {"John", "Tomas", "Tracy"};
        System.out.println(Arrays.toString(names ));

        System.out.println(" -----Sort()------------------------------");

        int [] numbers1 = {5,6,8,9,2,0};

        Arrays.sort(numbers1);
        System.out.println("Sort of , numbers1: " +Arrays.toString(numbers1));

        System.out.println(" -----equal()------------------------------");

        char [] arr1 = {'a','b','c'};
        char [] arr2 = {'b','a','c'};

        System.out.println(arr1==arr2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Equals()-Arr1&Arr2 : "+Arrays.equals(arr1,arr2));

        System.out.println(" -----copyof()------------------------------");
        int [] scores ={45,55,65,75,85};
        int [] scores2= Arrays.copyOf(scores,8);
        int [] scores3= Arrays.copyOf(scores,3);

        System.out.println("copyof() :Scores2"+ Arrays.toString(scores2));
        System.out.println("copyof() :Scores3" + Arrays.toString(scores3));

        System.out.println(" -----copyofRange()------------------------------");
        char [] elements = {'A','B','C','D','E'};
        //   0   1   2   3   4
        char[] someElements =Arrays.copyOfRange(elements,1,4);
        char[] someElements1 =Arrays.copyOfRange(elements,1,4+1);

        System.out.println("copyofRange() :SE" +Arrays.toString(someElements));
        System.out.println("copyofRange() :SE1" +Arrays.toString(someElements1));

        System.out.println(" ---- Iterating e()------------------------------");
        int [] numbers2 = {10,20,30,40,50,60,};
                       //   0   1   2   3   4
        for (int i =0 ; i <6 ; i++){
        System.out.println( numbers2[i]);

    }
        System.out.println(" ---- Iterating more()------------------------------");
        int [] numbers3 = {10,20,30,40,50,60,70,80};
        //   0   1   2   3   4
        for (int i =0 ; i <numbers3.length; i++){ // all if length-1,, until 70
            System.out.println( numbers3[i]);
        }
        System.out.println(" ---- reversing e()------------------------------");
        int [] numbers4 = {10,20,30,40,50,60,};
        //   0   1   2   3   4
        for (int i =0 ; i >numbers4.length ; i--){
            System.out.println( numbers2[i]);


        }
}}
