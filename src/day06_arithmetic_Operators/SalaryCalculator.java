package day06_arithmetic_Operators;

public class SalaryCalculator {

    public static void main (String [] args){

        int salary = 100_000;
        double stateTaxRate = 0.080d;        // 8%
        double federalTaxRate = 0.21d;     // 1%
        double totalTax;
        int salaryAfterTax;




        System.out.println("\nState Tax rate  : " +stateTaxRate);
        System.out.println("Federal Tax rate: " +federalTaxRate);
        System.out.println("Total Tax : " + stateTaxRate+federalTaxRate);
        System.out.println(" Salary  : " + salary);

        System.out.println(" Tax Rates : " +(stateTaxRate+ federalTaxRate));
        System.out.println(" Total Salary: "+(salary-(salary*stateTaxRate*federalTaxRate)));






    }
}
