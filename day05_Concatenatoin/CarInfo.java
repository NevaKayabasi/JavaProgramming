package day05_Concatenatoin;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = "Toyota",
                model = "Camny";
        int miles = 50000;
        String color = "Red",
               price = "$19000";

        String carInfo = year + " " + make + " " + model + "," + miles + " miles" + "," + color + "," +  price;

        System.out.println(carInfo);
    }
}
