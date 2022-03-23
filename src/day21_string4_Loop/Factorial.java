package day21_string4_Loop;

public class Factorial {
    public static void main(String[] args) {

        int d=8;
        int result =8;
        while (d>1){
        System.out.println(result+" * "+d+ " = " + (result*d));
            d--;
            result*=d;


        } System.out.println("Total : " + result*d);
    }}



//                     5*4*3*2*1 //
//                     repeate action: multiply the number by one less than it
//                      the stopping point : number goes to 1
//        int v = 5;
//        int result = 1;
//        while (v >1  ) {
//             result *=v;
//             v--;
//                       }
//        System.out.println(result+" * "+v+ " = " + (result*v));
////
//
//                System.out.println("_------------------");
        /////another approach

//        int w =5;
//        int result1 =1;
//        while (w >1  ) {
//            System.out.println(result1+ " * " + w+ " = "+(result1*w)); // 1*5, 5*4,20*3,60*2
//            result1 *=w;  // result = result * w
//            w--;
//        }
//        System.out.println("------------");
//        System.out.println("Total is :" +result1+" * "+w+ " = " + (result1*w));
//
//        System.out.println(" ----------------------------------");
//
//        int g=5;
//        int result=1;
//        while (g<=1){
//            System.out.println("total: ="+ result + "*" + g+ "="+(result*g));
//            result+=g;
//            g++;


//        System.out.println("--------------------------");

//        int h = 1;
//        int resul=1;
//
//        do {

//            h++;
//            resul+=h;
//            System.out.println("total: =" + resul + "*" + h + "=" + (resul * h));
//
//        } while (h < 7);
//                     resul*=h;
//            System.out.println("total: =" + resul + "*" + h + "=" + (resul * h));

//        int needed = 7;
//
//        for (int i =1; i <= 10 ; i++){
////            i*=needed;
//            System.out.println("Total: " + needed+ " * "+ i + " =  "+ (needed*i)) ;

        ////////////////for years

//    int result =n;
//        while (n > 1){
//
//                n--;
//                result *= n;
//
//                }
//                System.out.println(result * n);









