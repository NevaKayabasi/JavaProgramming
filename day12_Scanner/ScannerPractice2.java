package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter true or false");
        //boolean result = input.nextBoolean();

        System.out.println("Enter your name:");
        String name = input.next(); // only one word until a space
        // daha fazla kelime icin nextLine kullanilir

        System.out.println("name = " + name);
        input.close();
    }
}
