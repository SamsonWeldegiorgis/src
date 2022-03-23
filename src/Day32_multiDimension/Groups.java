package Day32_multiDimension;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [] [] cydeo  = new String [4] [] ;
//        String [] [] cydeo  = new String [4] [3] ;{nul,nul,nul,,,}
        System.out.println(Arrays.deepToString(cydeo));

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo [0]= groupOne;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("Adding second group");
        String [] groupTwo ={"Basri","Demet","Shina","Ismail"};
        System.out.println(Arrays.deepToString(cydeo));

        cydeo [1] = groupTwo;
        System.out.println("Adding third group");
        cydeo [2]= new String [] {"Mustafa" , "Lima"};
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo [3]=cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();
        for (String [] innerArray : cydeo){
        for (String eachWord : innerArray ) {

        System.out.println(eachWord);

    }
}}}
