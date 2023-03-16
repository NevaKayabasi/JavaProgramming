package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z' ; i++) {

            if (i == 'F') { // F i dahil etmeden biter
                break;
            }
            System.out.println(i+ " ");

            System.out.println("__________________");
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("Enter a number");
                int num = scan.nextInt();
                if(num <0){
                    break;
                }
            }

        }
    }
}
