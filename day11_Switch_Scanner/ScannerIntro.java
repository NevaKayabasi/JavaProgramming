package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter an interger: ");
      int num1 =  input.nextInt();

        System.out.println("Ent25er a decimal: ");
        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("multiplication: =" + (num1*num2));

        input.close(); // close the scanner ===> recommendation

        // close yazdiktan sonra scanner i bir daha altina bisey yazaip calistirmamazsin
    }
}
