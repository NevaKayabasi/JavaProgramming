package day08_IfStatement;

public class IdentfyNumber {
    public static void main(String[] args) {
        int number = 200;

        boolean isPositive = number > 0;
        boolean isNegative = number< 0;
        boolean isZero = number==0;

        System.out.println(number + " is positive number :" + isPositive);
        System.out.println(number + " is Negative number : = " + isNegative);
        System.out.println(number + " is Zero  = " + isZero);

    }
}
