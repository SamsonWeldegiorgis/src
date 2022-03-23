package day20_string_examples3;

public class IndexOfExample {
    public static void main(String[] args) {

        String word = "banana";
                //     012345

        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex); // 1

        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex); // 5

        int secondIndex = word.indexOf('a',firstIndex);
        System.out.println(secondIndex); // 1

         int secondIndex1 = word.indexOf('a',firstIndex+1);
        System.out.println(secondIndex1); // 3

        int thirdIndex = word.indexOf('a',secondIndex1+1);
        System.out.println(thirdIndex); // 5

        System.out.println(" -----------------------------");

        String s = "shopping cart 131231";
              //    12345678910111213      t=13;    if amazon * comes before the sentence,
                                            // if hard coded it is failure, but use the
                                    // above +1 system.





    }
}
