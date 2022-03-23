package day18_string_examples;

public class RemoveSpace {
    public static void main(String[] args) {

        String s = "    Saturday    ";
        System.out.println("s: "+s);
        System.out.println("s: "+s.length()); // 16

        s=s.trim();
        System.out.println("s: "+s);
        System.out.println("s: "+s.length());

        System.out.println(" ---------------");

        String str = "       java is fun      ";
        System.out.print("str: "+ str);
        System.out.println(str.length());
        System.out.println("strafterTrim: "+str.trim());

        str=str.trim();
        System.out.println(str.length());
        System.out.println(str.startsWith("java")); // true

    }
}
