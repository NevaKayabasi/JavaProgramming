package day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // int in kullndigi en kucuk sayi
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int  num = scan.nextInt(); // 1,2,3,4,5
            if (num>max){
                max = num ;
            }
        }
        System.out.println(max);
    }
}
/*
asks the user to enter a number for 5 times,
return the max number
 */