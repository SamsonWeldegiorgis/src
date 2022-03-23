package day26_nested_loops;

import java.util.Scanner;

public class CounterOnly2Wordss {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int count1 = 0;
        int count2 = 0;
        String word = "";
        boolean together = true;
        sentence=sentence.toLowerCase().trim();

        for (int i = 0; i < sentence.length() ; i++) {
            word += sentence.charAt(i);

            if (word.contains("java") && word.contains("python")) {
                if (word.contains("java"))
                    count1++;
                    word = word.replaceFirst("java", "");

                    if (word.contains("python"))
                        count2++;
                        word = word.replaceFirst("python", "");


                        if (count1 == count2)
                            together = true;
                        } else if (word.contains("java")==false && word.contains("python")==false) {
                            together = true;
                        } else {
                            together = false;
                        }
                    }
                    System.out.println(together);
                }
            }
