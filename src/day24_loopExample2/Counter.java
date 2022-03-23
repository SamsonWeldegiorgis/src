package day24_loopExample2;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {

        /*

    We study java not python   =  true

 */

        //        String str = "cat-cheetah-dog-cat-bat cat";



        //        counter of words & same figure counter
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int counter = 0;

//        String str = "cat-cheetah-dog-cat-bat cat";
        int cats =0;
        int dogs =0;
        boolean equal= true;

        for ( int i=0 ; i < str.length()-2; i++) { // i < str.length()-4

            if (str.substring(i, i + 3).equals("cat")) {
                cats++;

            } if (str.substring(i,i + 3).equals("dog")) {
                dogs++;
            }
        } if (cats == dogs) {
            System.out.println(equal);
        } else {
            System.out.println(!equal);
        }

        System.out.println("Dogs :"+ dogs);
        System.out.println("Cats :"+ cats);

             }
         }








