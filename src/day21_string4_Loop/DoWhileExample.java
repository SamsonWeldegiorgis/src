package day21_string4_Loop;

public class DoWhileExample {
    public static void main(String[] args) {

        // this is a valid do while while the boolean is true for the first
            // 10 numbers (0-10)

        int a = 0;

        do {        //everything b/n the curly brackets are in the loop
            System.out.println(a);
            a++;

         } while (a <=10);
            System.out.println(a+ " ");

            // this loop has a boolean of false, but it still runs the
          // body one time on time through the code b/s it is a do while.

        System.out.println("With false boolean");

        int a2 = 1;

        do {        //everything b/n the curly brackets are in the loop
            System.out.println("a2 : " + a2+ " ");
            a2++;

        } while (a2 ==10);
        System.out.println("a2 : " +a);


        // this is a while loop that is the same as the do while above, but
        // nothing will print from this one b/s it is false, the loop never
        // starts
        System.out.println("as a while loop");
        int a3 = 0;
        while(a3==10){
            System.out.println(a3);
            a3++;
        }

    }
}
