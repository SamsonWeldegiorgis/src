package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        byte age = 60;
        System.out.println("\n\tAge :" + age);

//        byte age2= 200;   // we can NOT hold 200 for a byte; it is too big for byte type
//                              it holds only -127 to 127

        // byte age2=200;    // it is asking me to change to int......

        short year = 2000; //declared a variable called year. It is short type
        System.out.println("\n\tYear :" + year);
        year = 2022; // assigned 2022 into my year variable
        System.out.println("\n\tYear : " + year+"\n");
        year= 2023; // reassigns the value to be 2023 , it changes it.
        System.out.println("\tYear :" + year+"\n" );

        int addressNumber =244440000;
        System.out.println("Address Number :"+addressNumber);
        long bigNumber = 12154715115L;
        System.out.println("Big Number\t\t:"+bigNumber);

        bigNumber= 1212145154524654654L;
        System.out.println("BigNumber\t\t: " + bigNumber);

        bigNumber =1510004564545l; // adding L to the number tell the compiler that it is a long
                                   // number




    }
}
