package day15_ForLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int min = 214748364; // int in kullndigi en kucuk sayi
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter a number");
                int  num = scan.nextInt(); // 1,2,3,4,5
                if (num<min){
                    min = num ;
                }
            }
            System.out.println(min);
        }

    }

/*
asks the user to enter a number for 5 times,
return the min number
*/