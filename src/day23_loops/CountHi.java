package day23_loops;

public class CountHi {
    public static void main(String[] args) {
        /*
         how many Hi are repeated
         */
        String str = "aaaaahiaaaahhihihibbcchih";
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println("The count number is: " + count);


        /////////////////another form also

        int counter = 0;

        for (int index = 0; index < str.length()-1; index++) {

            if (str.charAt(index)=='h' && str.charAt(index+1)=='i' ){
                count++;
            }
        }

        System.out.println(counter++);

    }}
//
//        System.out.println(" -------------another approach");
//
//        String str = "aaaaahiaaaahhihihibbcchihi";
//        int count  =0;
//
//        for (int index = 0; index <str.length(); index++){
//
//            if (str.charAt(index)=='h' && str.charAt(index+1)=='i'){
//                count++;
//            }
//        }
//        System.out.println("The count number is: "+count);




