package day08_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {

        // adding 1 to a variable
        int a = 10;
        a++;
        ++a;
        a= a+1;



        // adding  10 the variable
            int b = 4;
         // 10 times I write b++;

        b= 14;
        b = b+10 ;      // Option #1 : reads the value of b, adds 10 to it, then
                        // then the result is store back into b by reassigning
        b+=10;  // Option #2 , this code is the same as >> b=b+10;

        int count = 0;
        count+=5;   // adds 5 then gives >>> 5 (0+5)
        System.out.println( count);
        count -=10; // count  = count -10;then gives >>>> -5 (5-10)
        System.out.println( count);
         count*=2;  // -10  ( -5*2=-10)
        System.out.println( count);

    }
}
