package day26_nested_loops;

public class UniqueLetters {
    public static void main(String[] args) {
        /*
        String str = "aabdfccfs"  ...........output = bds
                      012345678

         */

        String str = "aabdfccfs";
        System.out.println(str.indexOf("b"));
        System.out.println(str.lastIndexOf("a"));

        for (int i=0; i<str.length();i++){
            char each= str.charAt(i);
            boolean isUnique = str.indexOf("f")==str.lastIndexOf("each");

            if(isUnique==true){
                System.out.println(each);

            }
        }

    }
}
