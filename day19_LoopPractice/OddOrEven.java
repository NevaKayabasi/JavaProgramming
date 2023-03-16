package day19_LoopPractice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num1 = scan.nextInt();

        if (num1 % 2 == 0){
            System.out.println("Even number");

        }else{
            System.out.println("Odd number");
        }
        System.out.println("Would you like to enter another number(yes/no)");
        String answer = scan.next().toLowerCase();

        if (!(answer.equals("yes") || answer.equals("no"))) {
           System.exit(0);
        }

        if (answer.equals("no")) {
            System.out.println("thank you using the calculator");
            //break;
        }
    }
}
