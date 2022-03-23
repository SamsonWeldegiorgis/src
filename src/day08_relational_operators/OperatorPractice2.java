package day08_relational_operators;

public class OperatorPractice2 {

    public static void main(String[] args) {

        int a = 40;

        System.out.println(--a);    // 39   ,, pre Increment XX -40-1 > 39
        System.out.println(--a);    // 38   ,, pre Increment XX -39-1 > 38
        System.out.println(a--);    // 38   ,, Post Increment same as abv -38 > 38
        System.out.println(--a);    // 36   ,, pre Increment XX -38-2 > 36
        System.out.println(--a);    // 35   ,, pre Increment XX -36-1 > 35
        System.out.println(a--);    // 35   ,, Post Increment same as abv -35 > 35
        System.out.println(--a);    // 33   ,, pre Increment XX -35-2 > 33
        System.out.println(--a);    // 32   ,, pre Increment XX -33-1 > 32

    }
}
