package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
       int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter you full name");
        String name = input.nextLine();

        System.out.println("Your GPA");
        double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Yoru chool");
        String school = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);
    }
}
/*
ask the user to enter age
ask the user to enter full name
 */