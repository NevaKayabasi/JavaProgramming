package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {


            System.out.println("First number:");
            int a = scan.nextInt();

            System.out.println("Second number:");
            int b = scan.nextInt();

            System.out.println("Addition" + (a + b));

            System.out.println("Would you like to continue");
            String str = scan.next().toLowerCase();

            while (!(str.equals("yes") || str.equals("no"))){
                System.err.println("Invalid entry re-entrt");
             str = scan.next().toLowerCase();
        }

            if(str.equals("no")); // exits the outer loop
            break;
        }
    }
}
