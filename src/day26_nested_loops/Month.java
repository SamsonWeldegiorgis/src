package day26_nested_loops;

public class Month {
    public static void main(String[] args) {

        /*
        go thru a whole month, by doing thru each week and each day
         */

//        for (int week=1; week <=4 ; week ++){
//            System.out.println("Week: " + week );
//
//            for (int day=1; day <=7; day++){
//                System.out.println("\tDay: " +day);
//            }
//        }

        for (int hour=1; hour<=2 ; hour++){
            System.out.println("Hour: " +hour);

            for (int minute=1; minute<=2; minute ++){
                System.out.println("\tMinute: " +minute);

                for (int sec=1; sec <= 4 ; sec ++){
                    System.out.println("\t\tSeconds: " +sec);

                    for (int miniSec=1; miniSec <= 2 ; miniSec ++){
                        System.out.println("\t\t\tMini-Seconds: " +miniSec);
                }
            }
        }
    }
}}
