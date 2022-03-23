package day30_arraysForEach;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split(",");
       System.out.println(Arrays.toString(days));

        for (String day : days){
            System.out.println(day);

        }

        System.out.println("-------------another example ------------");

        String [] withOutDay = s.split("day");

        for (String eachOther : withOutDay){
            System.out.println(eachOther);
        }

        System.out.println("-------------another example2 ------------");

        String str ="Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sept-Oct-Nov-Dec";

        String [] month = str.split("-");
//        System.out.println(month);

        for (String eachat : month){
            System.out.println(eachat);
        }

    }}
