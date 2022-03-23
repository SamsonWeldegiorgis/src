package day30_arraysForEach;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = {1,2,3};
        int [] c = a;

        if (a==b){


    }
        System.out.println(a==b); // compares the a array with b array, they are d/t objects
        System.out.println(Arrays.equals(a,b)); //
        System.out.println(a==c); // compares the a array with the c array, they are both reference to the same array obj
        System.out.println(a.equals(b)); // this is not an Arrays.equal

        boolean same = Arrays.equals(a,b);

        int [] d = {3,2,1};
        System.out.println(Arrays.equals(a,d));
}}
