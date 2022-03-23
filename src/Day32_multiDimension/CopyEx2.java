package Day32_multiDimension;

import java.util.Arrays;
import java.util.Scanner;

public class CopyEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Put the number of elements you want");
        int size = input.nextInt();
        int [] numbbb = new int [size];

        for (int i = 0; i <numbbb.length ; i++) {
            System.out.println("Enter the numbers");
            numbbb[i] = input.nextInt();
        }
        System.out.println("So far: "+ Arrays.toString(numbbb));

        int [] expanded = Arrays.copyOf(numbbb, numbbb.length+1);
        System.out.println("Put the number you wanted");
        expanded[expanded.length-1] = input.nextInt();

        System.out.println(Arrays.toString(expanded));


        System.out.println("---------copier again -------------");


        }

    }

