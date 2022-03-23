package day07_uniry_operators;

public class IncrementExample3 {

    public static void main ( String[] args){

        int i = 5;     // 6
        int z = i++;  // 5

        System.out.println( i); // 6    showing the after incrementing added 1 value
        System.out.println(z);  //  5( updates and shows the current value )


        int a = 12;
        int b = a;   // 12

        System.out.println( a); // 12
        System.out.println(b);  // 12

        int c= 3;
        int d = c+1;    // 4

        System.out.println(c); // 3
        System.out.println(d);  // 4

        int e   = ++c; //  c > 4    e >4


        System.out.println(e); // 4
        System.out.println(c);  // 4   showing the current status

        int f = ++c; // pre-increment  c>> 20   f>> 20

        System.out.println(c);  // 20
        System.out.println(f);  // 20

        int g = ++c;     // c > 21  g > 21

        System.out.println(c);  // 21
        System.out.println(g);  // 21

        int h = ++c;   // c > 22    h>> 22

        System.out.println(c);  // 22
        System.out.println(h);  // 22

        int j = c;    // c> 22  j > 22

        System.out.println(c);  // 22
        System.out.println(j);  // 22

        System.out.println(" -------------");
        // c == 22
        int k = c++; // post increment     c > 22(23) k > 23

        System.out.println(c);  // 23
        System.out.println(k);  // 22

        int l = c++; // post increment    c > 23 (24)   l >> 24

        System.out.println(c);  // 24
        System.out.println(l);  // 23


        int m = c++; // post increment   c> 24 (25 )    m> 25

        System.out.println(c);  //
        System.out.println(m);  //

        System.out.println(" -------------");






    }
}
