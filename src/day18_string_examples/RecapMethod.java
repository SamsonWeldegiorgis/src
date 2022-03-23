package day18_string_examples;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen";  // is String literal, it is in the String pool

        String s2 = new String("pen"); // is object in the heap, b/s we used new one

        System.out.println("Compare with =="+ ( s==s2)); // pen != pen, though same value but
        // not same object, it checks memory

        String s3 = new String("dog"); // is object in the heap,

        System.out.println("Compare with s2==s3 "+ ( s3==s2)); //
        // not same object, it checks memory




        System.out.println("Compare with .equals() : "+(s.equals(s2))); // pen = pen

        System.out.println(s.equals("Pen")); // pen != Pen
        System.out.println(s.equalsIgnoreCase("Pen")); // true b/s of ignore case


        boolean isSame = s.equalsIgnoreCase("Pen");
        if (s.equals("pen")){

        }
        int len = s.length();   // the string method/info of s.length is stored in the variable "len"
        System.out.println("length: " + len);

        // int a = 9;
        // a.length ()  > invalid
        // a.equals ()  > invalid

        if (s.length() >4){
            System.out.println("Long word");
        }else {
            System.out.println("Short word");
        }
        System.out.println("aaa: "+ ("aaa").length ()); // 3
        System.out.println("aa aa: "+("aa  a").length ()); // 5
    }
}
