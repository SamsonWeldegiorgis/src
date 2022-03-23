package day28_arrayPractice;

public class Initials {
    public static void main(String[] args) {
        /*
        Input : ["James Bond ", "Eve Rell" , "Anna Johnson"] ..........JB ER AJ
         */
//
//        String [] names = {"James Bond ", "Eve Rell" , "Anna Johnson", "Willy Orange"};
//
//        for (int i = 0; i <names.length; i++) {
//
//            String fullName = names[i];
//            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ")+1
//            System.out.println(""+fullName.charAt(0) + lastName.charAt(0) );
//        }
//
//        System.out.println(" Option 2 --------------------");
//        ///////////////option 2 ////////////////
//        for (String str : names){
//
//            String fullName = str.trim();
//            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ")+1
//            System.out.println(""+fullName.charAt(0) + lastName.charAt(0) );
//
//            str = str.trim();
//            System.out.println(str.trim().substring(0,1) + str.substring(str.indexOf(" ")).trim().charAt(0));

//        }

        System.out.println(" Option 2 --------------------");
        ///////////////option 2 ////////////////


        String[] name1 = {"Tom Cruise", "Mose Robert"};

        for (int j = 0; j <name1.length ; j++) {

        String firstName1 = name1[j];  // Tom Cruise
        String lastName2 = firstName1.substring(firstName1.indexOf(" ")).trim(); // Cruise

            System.out.println(""+ firstName1.charAt(0)+lastName2.charAt(0));

    }}}

