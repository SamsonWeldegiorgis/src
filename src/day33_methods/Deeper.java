package day33_methods;

public class Deeper {


    public static void deep(){
        System.out.println("Tewelde");
        deeper();
        System.out.println("Sam");

    }

    public static void deeper(){
        System.out.println("Hagos");
    }


    public static void main(String[] args) {
        System.out.println("Saron");
        deep();
        System.out.println("Not Deep");
    }}