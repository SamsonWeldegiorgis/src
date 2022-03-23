package day18_string_examples;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "last example";
        System.out.println("strEmpty: " + str.isEmpty()); // false,,, there is character and NOT empty
        System.out.println("strBlank: " + str.isBlank()); // false,,, there is character and NOT empty

        str = "";
        System.out.println("strEmpty: " + str.isEmpty()) ; // true ....it is empty,,,NO space
        System.out.println("strBlank : " + str.isBlank()) ; // true ....it is empty,,,NO space

        String s = " " ;
        System.out.println("strEmpty: " + s.isEmpty()); // false......b/se a space is a character .
        System.out.println("strBlank: " + str.isBlank()) ; // true ....space is considered as no character

//        if (s.length() == 0){
//            System.out.println("Empty"); //////////NO need to write like this
                                        ///   b/s a method  .isEmpty is already made


        String s2 = "             ";
        System.out.println("strEmpty: " + s2.isEmpty());// false ,,,space is character
        System.out.println("strBlank: " + s2.isBlank()); // true no characters



    }

}
