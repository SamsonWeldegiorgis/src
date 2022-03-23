package day20_string_examples3;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s= "java is a language";
        String some= s.replace("java", "c");
        System.out.println(some ); // c is languge

         String s1= "java is a language";
        String some1= s.replace('a', 'c');
        System.out.println(some1); // jcvc is c languge

        String day= "Today is monday.we will monday. its monday";
        day= day.replace("monday", "tuesday");
        System.out.println(day); // Today is tuesday.we will tuesday. its tuesday


        System.out.println(" ------------------------");
        String str= "Today is monday.we will monday. its monday";
        System.out.println(str.replaceFirst("monday" , "tuesday")); // changed the 1st monday to tuesday




    }
}
