package day33_methods;

public class MinStep {
    /*
           Task 5 :     Number of Steps to Main directory  --- Interview Task

                 We have a record of every time a change of directory is performed.
                 The different change directory functions are as follow ;

                     ../  Move to parent folder of current folder
                     ./   Remain in the same folder
                     x/   Move to the child folder named x


                     Write a method to Find the minimum steps required to go back to main directory
                      from current folder.The squence of operations performed after
                       entering the main directory provided

     Input : {"x/","y/","../","z/","./"}

                     Output : 2
     */
    public static void main(String[] args) {

    String [] input = {"x/","y/","../","z/","./","JavaProgramingB26/","Johnrageee","./","../"};
    String [] input2 = {"x/","y/","../","z/","./"};
        minSteps (input);
        minSteps (input2);

}

    public static void minSteps (String[] steps){
    int count=0;
    for (String eachStep : steps){

        switch (eachStep){
            case "./":    // stop no addition or subtraction
                break;
            case "../":    // it subtracts by one....
                count--;
                break;
            default:
                count++;  // it adds by one....
                break;
        }
    }

        System.out.println(count);
    }


}
