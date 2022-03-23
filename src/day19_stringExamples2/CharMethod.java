package day19_stringExamples2;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
               //   0123
        System.out.println(s.length()); // 4

        System.out.println(s.charAt(0));// j
        System.out.println(s.charAt(1));//a
        System.out.println(s.charAt(2));//v
        System.out.println(s.charAt(3));//a   or   s.lenght()-1;
        //  System.out.println(s.charAt(4));// compile error !

        int lastIndex = s.length() -1; // ... 3 this is the last index : (4 - 1) = a
        System.out.println("last char: " + lastIndex); //  .....3
        System.out.println("last char: " + s.charAt(3)); //  a
        System.out.println("last charlstIndx: " + s.charAt(lastIndex)); //  a


        int secondToLast = s.length()-2;
        char secondToLastChar = s.charAt(secondToLast);
        System.out.println("last char2toLas: " + s.charAt(secondToLast)); //  v

        System.out.println("");


    }
}
