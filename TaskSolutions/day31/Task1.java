package TaskSolutions.day31;

public class Task1 {

    public double hourlyRate, stateTaxRate, federalTaxRate, weeklyHours;

    public Task1(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

         public double salary(){

         double salary = hourlyRate * weeklyHours * 52;

         return salary;
         }

         public double stateTax(){

        double stateTax = salary() * stateTaxRate;
        return stateTax;

         }

         public double federalTax(){
         double federalTax = salary() * federalTaxRate;
         return federalTax;
         }

         public double salaryAfterTax (){

          double salaryAfterTax = salary() - (federalTax() + stateTax());
          return salaryAfterTax;
         }


         public String toString() {
        return "Task1{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
/*
1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */