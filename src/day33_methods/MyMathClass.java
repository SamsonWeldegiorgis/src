package day33_methods;

public class MyMathClass {
    public static void main(String[] args) {
        add(100,5);
        subtract(100,5);
        multiply(100,5);
        divide(100,3);
        remainder(20,6);


    }

    public static void add(double numb1, double numb2){
        System.out.println("The sum total is : " + (numb1+numb2));
        System.out.println(numb1+ " + " + numb2 +"= "+(numb1+numb2));

    }    public static void subtract(double numb1, double numb2) {
        System.out.println("The difference is : " + (numb1 - numb2));
        System.out.println(numb1+ " - " + numb2 +"= "+(numb1-numb2));
    }
    public static void multiply(double numb1, double numb2) {
        System.out.println("The product is : " + (numb1 * numb2));
        System.out.println(numb1+ " * " + numb2 +"= "+(numb1*numb2));
    }
    public static void divide(double numb1, double numb2) {
        if (numb2 !=0) {
            System.out.println();
            System.out.println("The quotient is : " + (numb1 / numb2));
            System.out.println(numb1 + " / " + numb2 + "=" + (numb1 / numb2));
        }else {
            System.err.println("Can not divide by 0");
        }
    }
    public static void remainder(double numb1, double numb2){
        System.out.println("The remainder is : " + (numb1 % numb2));
        System.out.println(numb1+ " % " + numb2 +"= "+(numb1%numb2));
}}
