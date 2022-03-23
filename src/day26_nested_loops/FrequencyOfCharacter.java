package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        /*
        String apple : count how many times each letter is in the string
        if available count(frqcy): a -1  ;  p- 2 ; l- 1 ; e -1

           hint : go one characcter at a time   ...
              then compare charAt(0) >>>>a  ....a>a   , a>p  , a>p , a>l  , a>e
              then compare charAt(1) >>>>a  ....p>a   , p>p  , p>p , p>l  , p>e
         */

        String s = "appleee";
        String checked="";

        for (int i=0 ; i<s.length(); i++){

            int counter= 0; // everytime the counter loop iterates, the counter is set back to 0== reset b/n every character
            char letter = s.charAt(i);

            if (checked.contains(""+letter)){
                continue;
            }

            for(int j=0 ; j<s.length(); j++){

                char eachLetter= s.charAt(j);

                if (letter==eachLetter) { // s.charAt(i) == s.charAt(j);
                    counter++;

                }
            } // end of the inner loop
            System.out.println(letter + " - " + counter);    // prints all aple
            checked+=letter;

            /////////////if we need only ones

//        } // end of the inner loop
//        if (counter==1) {
//            System.out.println(letter + " - " + counter);    // prints all aple
//        }checked+=letter;



        ///////////////////////another illustration ////////////


//        for (int i=0 ; i<s.length(); i++){
//
//            int counter= 0; // everytime the counter loop iterates, the counter is set back to 0== reset b/n every character
//            char letter = s.charAt(i);
//
//            if (!checked.contains(""+letter)){
//
//            }
//
//            for(int j=0 ; j<s.length(); j++){
//
//                char eachLetter= s.charAt(j);
//
//                if (letter==eachLetter) { // s.charAt(i) == s.charAt(j);
//                    counter++;
//
//                }
//            } // end of the inner loop
//            System.out.println(letter + " - " + counter);   // prints all appleee
//            checked+=letter;

    }}}

