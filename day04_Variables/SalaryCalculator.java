package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourlyRate, weeklyRate

        int HourlyRate = 65;
        int WeeklyHours = 35;

        int salary = HourlyRate * WeeklyHours * 52;

        //System.out.println(salary); bu da olur ama bunun yerine soutv kisa yolu kulunnailir

        System.out.println("HourlyRate = $" + HourlyRate); // dolar isareti tirngin icine
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("salary = $" + salary);


    }
}
