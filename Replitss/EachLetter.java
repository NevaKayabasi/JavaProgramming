package Replitss;

import java.util.Scanner;

public class EachLetter {



        public static void main(String[] args) {


            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();

            //WRITE YOUR CODE BELOW
            for (int i = 0; i < word.length(); i++) {
                String eachChar = "" + word.charAt(i);
                System.out.println(eachChar);
            }

        }
    }




