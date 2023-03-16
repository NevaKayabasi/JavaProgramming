package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator");
        char opeartor = scan.next().charAt(0);

        if (!(opeartor == '+' || opeartor == '-')) { // if the operator is not valid
            System.out.println("Invalid operator : " + opeartor);
            System.exit(0);
        }

        System.out.println("Enter a number");
        int num2 = scan.nextInt();

        if ((opeartor == '+')){
            System.out.println(num1+num2);

        }else{
            System.out.println(num1 - num2);
        }

    }
}
