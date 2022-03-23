package day24_loopExample2;

public class countJava2 {
    public static void main(String[] args) {



    String str = "java is a java language.java";
    int count =0;

    while (str.contains("java")){
//        System.out.println(str);
          str=str.replaceFirst("java", "*");    // replace changes all , but replacefirst is only to 1st
          count++;
    }
        System.out.println("java : "+count);


        String fan = "most people need me mostly, most of the most time";
        int counter=0;

        while(fan.contains("most")){
            fan= fan.replaceFirst("most","*");
            counter++;
        }
        System.out.println("most : " +counter);



}}

