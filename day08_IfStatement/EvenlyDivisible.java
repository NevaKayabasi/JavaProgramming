package day08_IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 65;

        boolean divisibleBy2 = 65%2 == 0;
        boolean divisibleBy3 = 65 % 3 == 0;
        boolean divisibleBy5 = 65 % 5 == 0;


        System.out.println(".............");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + "isLeapYear = " + isLeapYear);


    }
}
