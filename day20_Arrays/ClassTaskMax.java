//Write a program that asks user to enter a number 10 times:
//			1. store all user entered numbers in an array
//			2. find the max number

package day20_Arrays;

import java.util.Scanner;

public class ClassTaskMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[10];


        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a number");
            num[i] = scan.nextInt();
        }
        int max = num[0];
        int min = num [0];
        for (int i= 0; i < num.length  ; i++) {


            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);
        }




    }

