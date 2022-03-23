package day07_uniry_operators;

public class SalaryCalculator {
    public static void main( String [] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08 ;  // 8%
        double federalTaxRate = 0.21 ;   // 21%
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary*stateTaxRate; // 100000*8% = 8,000
        federalTax = salary*federalTaxRate;  // 100000*21% = 21,000
        totalTax = stateTax+federalTax;   // 8,000+21,000 = 29,000
        salaryAfterTax=salary-totalTax;   // 100000-29,000 // 71,000


        String taxReport = "State tax rate :"+ stateTaxRate + ", Federal tax rate: "
                + federalTaxRate+",base salary:$"+ salary+ "\nTax amounts:"+ stateTax
                + " for state tax and "+federalTax+ " for federal tax, coming to a total of "+ totalTax
                +"\n After tax your salary is "+ salaryAfterTax;



        System.out.println(("\nTax Report:" + taxReport));


    }
}
