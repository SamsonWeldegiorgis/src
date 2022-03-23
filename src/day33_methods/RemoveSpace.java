package day33_methods;

import java.util.Arrays;


/*
 String input = "      Hello World    I    love      java            ";
  String input = "Hello World I love java";
 */
public class RemoveSpace {
    public static void main(String[] args) {
        String input = "      Hello World    I    love      java            ";
        removeString(input);


    }
    public static void removeString(String str){

        String [] s =str.trim().split(" ");
        System.out.println(Arrays.toString(s));


            String result="";
            for (String each :s){

            if (!each.isEmpty()){
                result += each + " ";

            }
        }
        System.out.println(result);


    }
}
