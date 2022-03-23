package day19_stringExamples2;

public class IndexofMethod {
    public static void main(String[] args) {

        String s = "pen";

        System.out.println(s.indexOf("p")); // 0
        System.out.println(s.indexOf("e")); // 1
        System.out.println(s.indexOf("n")); // 2
        System.out.println(s.indexOf("en")); // 1 // it give the value what it starts at ,,,,
        System.out.println(s.indexOf("pe")); // 0
        System.out.println(s.indexOf("pn")); // -1


        System.out.println(s.indexOf("x")); // -1 // if not in the declared value, it shows NEGATIVE,,,,,
        System.out.println(s.indexOf("z")); // -1
        System.out.println(s.indexOf("pz")); // -1 // doesn't have a sequence
        System.out.println(s.indexOf("ee")); // -1 // doesn't have a sequence



    }
}
