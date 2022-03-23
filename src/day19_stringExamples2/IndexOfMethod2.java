package day19_stringExamples2;

public class IndexOfMethod2 {
    public static void main(String[] args) {

        String s = "java";
        System.out.println(s.indexOf('a')); //1
        System.out.println(s.lastIndexOf('a')); // 3

        System.out.println("---------------------------");

        String s2= "abcbcb";
        System.out.println(s2.indexOf('b')); //1   ,,,,to get the index of first b
        System.out.println(s2.indexOf('b',2)); // 3 ....to get the index of second b
        System.out.println(s2.lastIndexOf('b'));   //5 .,,,,to get the index of last/third b

        System.out.println(s2.indexOf("cb"));  //2 // to get the value of the first c
        System.out.println(s2.lastIndexOf("cb"));  //4 // to get the value of the last c
        System.out.println(s2.indexOf("cbd"));  //-1  // not right sequence
        System.out.println(s2.indexOf("z"));  //-1  // not available in the characters


    }
}
