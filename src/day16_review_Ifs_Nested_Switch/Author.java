package day16_review_Ifs_Nested_Switch;

public class Author {
    public static void main(String[] args) {
        /*
        average number of countries=50/5 published in. Find and print the information based on the genre.

Make variables for all of that information. Given empty defaults for all the variables

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
         */


        int a=3 ;   // 4
        int b=++a;  // 4

        int c=3 ;   // 4
        int d=c++;  //  3


        System.out.println(a);  // 9
        System.out.println(b);  // 8

                System.out.println(b-- + "" + ++a +  "" + b++ + "" + --a);
                               //  4 >3    +   5    +     3     +    4
                                //   4 5 3 4


    }
}
