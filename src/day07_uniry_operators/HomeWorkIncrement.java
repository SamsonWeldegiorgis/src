package day07_uniry_operators;

public class HomeWorkIncrement {
    public static void main(String[] args) {

           int b = 37;
               b++;    // 37 > 38
                 System.out.println(b++);    // 38>39
                 System.out.println(b);      // 39
                 System.out.println(b++);    // 39 > 40
                 System.out.println(b++);    // 40>41
                 System.out.println(b);      // 41
                 System.out.println(b++);    // 41 > 42
                 System.out.println("Add:"+b);      // 42


        int f =25 ;  // > 25
        int l =   -f + f++ - --f * 2;
              //  -25 + 25>26 - 25 * 2
              //  -25 + 25 - 50
             //   0-50
             //     -50

        System.out.println("aaa:"+f); // 25
        System.out.println("aaa:"+l); //-50



        int d = 56; //
        d++;    //   56 > 57
        System.out.println(d);      // 57
        System.out.println(d++);    // 57 > 58
        System.out.println(d++);    // 58 > 59
        System.out.println(d);      // 59

        System.out.println("ddd:"+d); // 59





        int f1 = 36;
        System.out.println("fffadf :" + --f1);    // 35
        System.out.println(" ------------");
        System.out.println(--f1);    // 34
        System.out.println(--f1);    // 33
        System.out.println(f1--);    // 33 > 32
        System.out.println(--f1);    // 31
        System.out.println(--f1);    // 30
        System.out.println(f1--);    // 30 > 29
        System.out.println(f1--);    // 29> 28

        System.out.println("Victoria:"+f1); // 28


        int l1 = 36;

        System.out.println(l1--);    // 36 > 35
        System.out.println(l1++);    // 35 > 36
        System.out.println(--l1);    // 35
        System.out.println(l1--);    // 35 > 34
        System.out.println(l1++);    //  34 > 35
        System.out.println(l1);      // 35

        System.out.println("Sam,:"+l1); // 35

    }
}
