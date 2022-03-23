package day13_if_statements3;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the language number: \n 1-English\n 2- Spanish \n 3- Turkish" +
                " \n 4- Russian \n 5- French");
        int lang1= input.nextInt();
        String output = input.nextLine();

        if ( lang1 == 1) {
            output= "hello, thank for your call";
        } else if (lang1 ==2){
            output=  "hola, gracias para llamar";
        }else if  (lang1==3){
            output= "merhaba, aradiginiz icin tesekkurler";
        }else if ( lang1 ==4){
            output= "privet, spasibo za vash zvonok";
        }else if (lang1 == 5) {
           output= "Merci ,pour votre appel";
        }else {
            output = "We will use English by default, Hello, Thank for your call  !";
        }
        System.out.println(output);
        }
}
