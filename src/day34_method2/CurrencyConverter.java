package day34_method2;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency type");
        String currencyType = in.next();
        System.out.println("Enter the currency amount");
        double currencyAmountAs$ = in.nextDouble();
        currency(currencyType , currencyAmountAs$);

    }
    public static double currency(String currencyType ,double currencyAmountAs$){
        switch (currencyType) {
            case "Euro":
                return currencyAmountAs$ * 0.91;
            case "yen":
                return currencyAmountAs$ * 121.03;
            case "lira":
                return currencyAmountAs$ * 14.85;
            case "won":
                return currencyAmountAs$ * 1_217.52;
            case "rupee":
                return currencyAmountAs$ * 181.45;
            default:
                return 0;

        }}
}
