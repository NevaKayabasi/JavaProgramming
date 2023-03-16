package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Your bulding number:");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Street name:");
        String street = input.nextLine();

        System.out.println("City name:");
        String cityName = input.nextLine();

        System.out.println("Your state");
        String state = input.nextLine();

        System.out.println("Zip code:");
        int code = input.nextInt();

        input.close();

        System.out.println("name = " + name);
        System.out.println("buldingNumber = " + buildingNumber);
        System.out.println("street = " + street);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("code = " + code);
    }
}
/*
enter full name
bulding number
street name
city name
State
zipcode

display shipping adress
 */