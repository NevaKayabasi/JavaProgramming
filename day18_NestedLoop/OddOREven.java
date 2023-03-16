package day18_NestedLoop;

import java.util.Scanner;

public class OddOREven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to add another number?");
            String str = scan.next().toLowerCase();

            while(!(str.equals("yes")) || str.equals("no")){
                System.err.println("re enter another number?");
                str = scan.next().toLowerCase();
            }

            if(str.equals("no")){
                break;
            }
        }
    }
}
/*
Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps

 */