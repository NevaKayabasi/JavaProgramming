package Replitss;

import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:
        for(String each : words){

            System.out.println(+each.charAt(0)+each.charAt(each.lastIndexOf(",")));

        }

    }
    }


