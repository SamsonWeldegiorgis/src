package day19_stringExamples2;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";   // cheech  =
            //        012345

        String mergedBack ="";  // back ward of sunday = yadnus .....

        mergedBack += str.charAt(5);///
        mergedBack += str.charAt(4);
        mergedBack += str.charAt(3);
        mergedBack += str.charAt(2);
        mergedBack += str.charAt(1);
        mergedBack += str.charAt(0);

        System.out.println(" ------------------------");

        System.out.println("MergedBack: "+mergedBack);

        System.out.println(str.substring(1)); // unday
        System.out.println(str.substring(3)); // day
        System.out.println(str);
        System.out.println("satur" + str.substring(3)); // saturday
        System.out.println(str.substring(3,6)); // day  ... the 6th is 5th /not included
        System.out.println(str.substring(0,5)); // sunda  ...the 5 is not included
        System.out.println(str.substring(0,6)); // sunday  ...the 5 is not included
//        System.out.println(str.substring(0,7)); // our of bounds b/s 6 index is read
        System.out.println(str.length());//6
//        System.out.println(str.charAt(6)+str.charAt(5));
    }
}
