package day14_IfStatements4;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nPut the age group: ");
        int ageGroup = input.nextInt();
        String ageName = "";

        // which age group you belong :

        if (ageGroup <= 2 & ageGroup > 0) {
            ageName = "Baby";
        } else if (ageGroup >= 3 && ageGroup <= 5) {
            ageName="Toddler";
        }  if (ageGroup >= 6 && ageGroup <= 9){
            ageName="Kid";
        }  if (ageGroup >= 10 && ageGroup <= 12) {
            ageName="Pre=teen";
        }  if (ageGroup >= 13 && ageGroup <= 17) {
            ageName="Teenager";
        }  if (ageGroup >= 18 && ageGroup <= 20) {
            ageName="Young Age";
        }  if (ageGroup >= 21 && ageGroup <= 35) {
            ageName="Adult";
        }  if (ageGroup >= 36 && ageGroup <= 55) {
            ageName="Middle-Aged Adult";
        }  if (ageGroup > 55 && ageGroup < 120) {
            ageName="Senior Citizen";


        } else  { if ( ageGroup<=0 ){
            ageName="Invalid Age, you can not put negative ages";
            } else if ( ageGroup >= 120){
            ageName="Greater than the age, put less than it";
        }

            System.out.println(ageName);

    }}}





