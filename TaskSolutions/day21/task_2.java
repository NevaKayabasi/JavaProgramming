package TaskSolutions.day21;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int even = 0;
        int odd = 0;
        for (int each : nums) {
            if(each %2==0){
                even++;

            }else{
                odd++;
            }

        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: " +odd);
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */

