package day19_stringExamples2;

public class IndexMethod3 {
    public static void main(String[] args) {

        String word = "definition";
           //          0123456789

        System.out.println("first i: "+ word.indexOf('i'));// 3
        System.out.println("last i: "+ word.lastIndexOf('i'));  // 7


//        System.out.println("second i: "+ word.indexOf('i', 3));  // 3 // can not use 3 b/s it the index of first i
        System.out.println("second i: "+ word.indexOf('i', 4));  // 5.....start at pos : 4 ......nition"
        System.out.println("third i: "+ word.indexOf('i',6 ));  // 7 .......start at pos 6: ,,,,,,tion
    }
}
