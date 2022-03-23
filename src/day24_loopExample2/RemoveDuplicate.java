package day24_loopExample2;

public class RemoveDuplicate {
    public static void main(String[] args) {

        /*
        Remove duplicat: ex : abcabc,,,,,,,output : abc
         */
        String str = "abcabckejrenweujijeirsakderr6666";
        String unique = "";

        for (int i=0; i<str.length(); i++){             //  i                 > 0
            if (!unique.contains("" + str.charAt(i))){ // charAt(i) = charAt(0)> a
                  unique+=str.charAt(i);                //  unique             > " " / 0

        }}
        System.out.println(unique);

//
//            for ( int s = 0 ; s < str.length() ; s++){
//
//                unique+=str.charAt(i);
//                System.out.println(((unique*str));
//            }

    }}


