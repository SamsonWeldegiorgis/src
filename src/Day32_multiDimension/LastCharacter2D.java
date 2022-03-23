package Day32_multiDimension;

public class LastCharacter2D {
    public static void main(String[] args) {
        /*
Get the last element of the   ,,,ssk ,,,,,esre,,,,,,sw
         */

        String [] [] words = { {"James","is","back"},{"he","was","never","gone"},{"methods","tomorrow"} };

        for(String [] eachArray : words){

            for (String eachWord : eachArray) {

                System.out.print(eachWord.substring(0,1) + "" + "" + (eachWord.charAt(eachWord.length()-1)+" "));
            }
            System.out.println(" -------------------------------");


            /////////////////first & Last character
            String [] [] words1 = { {"James","is","back"},{"he","was","never","gone"},{"methods","tomorrow"} };

            for(String [] eachArray1 : words){

                     for (String eachWord : eachArray1) {


        System.out.print(eachWord.substring(0,1) + "" + "" + (eachWord.charAt(eachWord.length()-1)+" "));   System.out.print(eachWord.charAt(eachWord.length() - 1));//// words[i][j].charAt(words[i][j].length() -1));

        }}}}
        }



