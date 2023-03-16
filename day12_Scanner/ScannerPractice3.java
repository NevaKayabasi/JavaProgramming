package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your full name");
        String name = input.nextLine();


        System.out.println("Your favorite pet");
        String pet = input.nextLine();

        System.out.println("your age");
        int age = input.nextInt();

        input.nextLine(); // int ten sonrs string kullandik diye bi atne daha ekledik

        System.out.println("your school");
        String schoolName = input.nextLine();




        System.out.println("name = " + name);
        System.out.println("pet = " + pet);
        System.out.println("schoolName = " + schoolName);
        System.out.println("age = " + age);

        input.close();
    }
}
