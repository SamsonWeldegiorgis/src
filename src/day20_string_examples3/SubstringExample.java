package day20_string_examples3;

import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {

        String target = "Today is monday.we will monday. its monday";

        int firstIndex = target.indexOf('.'); // 15
        int secondIndex = target.lastIndexOf('.'); // 30

        String middleStr = target.substring(firstIndex, secondIndex); // we will monday
        middleStr = middleStr.replace("monday", "weekday");// .we will weekday

        System.out.println(target.substring(0,firstIndex)+middleStr
                +target.substring((secondIndex))); // changed the middle to weekday from monday
        // Today is monday.we will weekday. its monday

         /*
        Ex:
  Input:
    javapython =true 1 & 0  .....  cjavac++ True .... c#javaruby  ...false
 // java                            java                java
         */


        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if ( word== word.substring(0)==word.startsWith("java") ||
                word ==word.substring(1) == word.startsWith("java")){
            System.out.println("true");
        }else if ( word == word.substring(4) == word.startsWith("java") ==
                word.contains(word.substring(0,word.length()))){
            System.out.println("false");

//        System.out.println(word == wordStart2 && word.contains("java"));


//
//        System.out.println(word.contains("java") == word.startsWith(word.substring(0)));
//        System.out.println(word.contains("java") == word.startsWith(word.substring(0, word.length()-4)));
//        System.out.println(word.contains("java") == word.contains(word.substring(3)));
//        System.out.println(word.contains("java") == word.startsWith(word.substring(4)));
//        System.out.println(word.contains("java") == word.startsWith(word.substring(5)));


//
//        if (word.startsWith("java")==word.contains(word.substring(0, word.length())) // true
//        || (word.contains("java")==word.contains(word.substring(1, word.length())))){  // true
//            System.out.println("true");
//        }else if (word.startsWith("java") == word.contains(word.substring(3, word.length())))
//        { System.out.println("false");

//       if (word.equals("java") == word.substring(1,word.length()))) {
//           System.out.println("true");
//       }else
//        { System.out.println("false");


//        } else if (word.toLowerCase().contains("java") == word.contains(word.substring(start+1,end))){
//             System.out.println("false");

            //
//        System.out.println(word.substring(start,end ));

        }}}

//        }; //c#javaru//
//        // /               java == va   /   ava   // ava = 2
//        System.out.println("0: " + word.substring(1,word.length())); //c#javaru//
//        // /               java == va   /   ava   // ava = 2
//        System.out.println("0: " + word.substring(2,word.length())); //c#javaru//
//        // /               java == va   /   ava   // ava = 2



//            System.out.println("true");
//        } else
//            System.out.println("false");



//        String word="c#javaruby";
//        System.out.println("sub:" + word.contains(word.substring(1,word.length()))); // avaruby=  true
//        System.out.println("sub:" + word.equals(word.substring(3,word.length()))); // avaruby=  true
//        System.out.println("sub:" + word.contains(word.substring(4,word.length()))); // avaruby=  true
//        System.out.println("sub:" + word.equals(word.substring(0,word.length()))); // avaruby=  true
//        System.out.println("Java: " +word.contains( "java"));   //true

// c#javaruby  > avaruby       == java
//            System.out.println("Java: "+ "true");
//        }else {
//         System.out.println("Java: "+"false");







//        String word = "c#javaruby ";
//        System.out.println(word.substring(0,word.length()) ); // javapython
//
//
////        String result = word.contains("c#javaruby "); //
////        System.out.println("result:" +result);  //
//        System.out.println("0: " + word.substring(0,word.length())); //c#javaruby
//        System.out.println("1: " + word.substring(1,word.length())); //#javaruby
//        System.out.println("2: " + (word.substring(2,word.length()))); //javaruby
//        System.out.println("3: " + (word.substring(3,word.length()))); //avaruby
//        System.out.println( word.indexOf(word.charAt(0)) ); //0
//        System.out.println( word.indexOf(word.charAt(1)) ); //1


//    String result = "About 4,500,000,000 results (0.70 seconds) ";
//        int startIndex = result.indexOf(" ");  // t-4
//        int endIndex = result.indexOf("r");  // 0-r( or )
////        int endIndex = result.indexOf(" ", startIndex + 1);  // 0-r
//        System.out.println(result.substring(startIndex + 1, endIndex));
////        System.out.println(result.substring(startIndex + 1, endIndex));


