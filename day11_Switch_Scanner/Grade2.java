package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'B';
         // or logic with switch
        String result = "";

        switch (ch){

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                result = "Passed";
                break;
                case 'F':
                result = "Failed ";
                break;
                default:
                result = "Invalid";
        }

    }
}
 /* if the grade i sA or B or C or D =======> passed
 otherwise failed
  */