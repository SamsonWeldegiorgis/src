package day34_method2;

public class VoidReturn {
    public static void main(String[] args) {
        sayHello();
        // String msg= sayHello(); .....this doesn't work b/s the method is void...

        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);

    }

    public static void sayHello (){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye" ;
    }
}
