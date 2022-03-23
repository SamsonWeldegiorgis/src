package day20_string_examples3;

import java.util.Scanner;

public class FirstCapsSubstring {
    public static void main(String[] args) {

           /*
Ex:
  Input:
    jeff_bezos@amazon.us     sergey_brin@gmail.com

    First name: Jeff    Last name: Bezos     Domain: Amazon
*/
                Scanner scan = new Scanner(System.in);
                String email = scan.next();


                ///for sergey_brin@gmail.com
//
//                int firsFirst = email.indexOf(0);
//                int lastFirst = email.indexOf('_');
//                // firsFirst+1, lastFirst-5).toUpperCase()  ....to upper J / S
//
//                int firsLast = email.indexOf('_');
//                int lastLast = email.indexOf('@');
//
//                int firsDomain = email.indexOf('@');
//                int lastDomain = email.indexOf('.');
//
//
//
//                String firstName =email.substring(firsFirst+1, email.lastIndexOf('_')-5).toUpperCase()
//                        + email.substring(firsFirst+2, lastFirst);
//                System.out.println("First name: "+firstName);
//
//                String lastName =email.substring(firsLast+1,lastLast-3).toUpperCase()
//                        +email.substring(firsLast+2,lastLast);
//                System.out.println("Last name: "+ lastName);
//
//                String domain =email.substring(firsDomain+1,lastDomain-4).toUpperCase()
//                        +email.substring(firsDomain+2,lastDomain);
//                System.out.println("Domain: "+domain);


                ////or //////////// for jeff_bezos@amazon.us
                int firsFirst1 = email.indexOf(0);
                int lastFirst1 = email.indexOf('_');

                int firsLast1 = email.indexOf('_');
                int lastLast1 = email.indexOf('@');

                int firsDomain1 = email.indexOf('@');
                int lastDomain1 = email.indexOf('.');


                String firstName1 =email.substring(0, lastFirst1-3).toUpperCase()
                        + email.substring(firsFirst1+2, lastFirst1);
                System.out.println("First name: "+firstName1);

                String lastName1 =email.substring(firsLast1+1,lastLast1-4).toUpperCase()
                        +email.substring(firsLast1+2,lastLast1);
                System.out.println("Last name: "+ lastName1);

                String domain1 =email.substring(firsDomain1+1,lastDomain1-5).toUpperCase()
                        +email.substring(firsDomain1+2,lastDomain1);
                System.out.println("Domain: "+domain1);


}

}
