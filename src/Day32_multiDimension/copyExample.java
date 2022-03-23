package Day32_multiDimension;

import java.util.Arrays;

public class copyExample {
    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = a; // b is a new reference/name but the array is the same as the one 'a' reference/name is pointing to, so there is only one array

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        System.out.println("----copying traditionally----");

        a [0] = 100;
        b [1]= 200;
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        System.out.println("----copying via array method----");

        int [] z = Arrays.copyOf(a, a.length);
        System.out.println("z: " + Arrays.toString(z));

        z [0] = 500;

        System.out.println("z: " + Arrays.toString(z));
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

        int [] z1 =a;
        z1 [2] = 300;
        System.out.println(" ------------");

        System.out.println("z: " + Arrays.toString(z));
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));

    }
}
