package day11_Switch_Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int n = 100;
        String result = "";

        boolean validNumber = n == 50 || n == 75 || n == 100;

        if (validNumber) { // n 50, 75, 100
            if( n== 50){
                result = "20 crew , 30 passenger";
            }else if (n == 75){
                result = "25 crew , 50 passenger";
            }else{
                result = "30 crew , 70 passenger";
            }


        } else {
            result = "Invalid Number";


            System.out.println(result);
        }
    }
}
/*
Create a class called CrewAndPassangers, Given a number
of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */