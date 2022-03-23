package day28_arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        /*
        make an array of your friends names, asking how many friends do you have
        then ask for each friend's name at one time , store & print all the names into an array
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends you want to have");
        int size = input.nextInt();
        String [] friendsList = new String[size];

        for (int i = 0 ; i < friendsList.length; i++){

        System.out.println("Enter the name of friends :" + (i+1));
        friendsList[i] = input.next();
    }
        System.out.println("Your friends are : " + Arrays.toString( friendsList));



    }
}
