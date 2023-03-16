package Replitss;

import java.util.Scanner;

public class Vowels {


        public static void main(String[] args) {
            //DO NOT TOUCH FOLLOWING LINE/LINES
            Scanner input = new Scanner(System.in);
            String word = input.nextLine();

            //WRITE YOUR CODE BELOW
            char ch1 = 'a',
                 ch2 = 'e', ch3= 'i', ch4 = 'o', ch5= 'u';

            for(int i = 0; i < word.length() ; i++){
                String result = ""+ word.charAt(i);
                if(!(word.contains("a" ))){
                    System.out.println();
                }


            }
        }
    }


