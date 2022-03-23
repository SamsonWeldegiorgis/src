package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
//
//        int h = 5;
//        int p = h;   // at this point h=5 and p =5;
//                    // p = 5, if h is changed doesn't affect p;
//
//        h++; // post increment , no other code so it adds 1
//
//        System.out.println("h:"+ h); //6
//        System.out.println("p:"+p); //5
//
//        int k = h++;  // h = 6  ,,,now will add +1 == 7, but K has the last h's value=6
//
//
//
//        System.out.println( "h:"+h ); // 7
//        System.out.println("k: " +k); // 6
//
//
//        int g = ++h;   // h will be preincrement -- 7+1 = 8 ,
//                        // but g has increased b/s it has already updated to be 8
//
//        System.out.println( "h:"+h ); // 8
//        System.out.println("g: " +g); // 8

        int g=20;
        int j=--g;   // 8 ,,,,will be now 7
        int k1=--g;
        int l=g--;
        int m=--g;
        int n=g--;

        System.out.println("j:"+g );  // 19
        System.out.println("k1:"+g );  // 18
        System.out.println("l:"+g );    // 18
        System.out.println("m:"+g );    // 17
        System.out.println("n:"+g );    // 17





    }
}
