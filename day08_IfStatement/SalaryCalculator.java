package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRates weeklyHours  stateTaxRate federalTaxRate

        int hourlyRate = 50;
         int weeklyHours = 45;

         double stateTaxRate = 6.5;
          double  federalTaxRate    = 26.2;

          int salaryBeforeTax = hourlyRate * weeklyHours * 52;
          double stateTax = salaryBeforeTax * stateTaxRate / 100;
          double federalTax = salaryBeforeTax * federalTaxRate / 100 ;
          double totalTax = stateTax + federalTax;
          double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is " + salaryBeforeTax);
        System.out.println("State tax = $ " + stateTax);
        System.out.println("federal tax  = $" + federalTax);
        System.out.println("Total tax = $ " + totalTax);
        System.out.println("Net income =$ " + salaryAfterTax);
    }
}




