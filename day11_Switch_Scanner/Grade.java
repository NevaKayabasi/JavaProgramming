package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B'; // ==
       // String result = " " ;
         switch (grade){
             case 'A' :
                // result = "Excellent";
                System.out.println("Excellent");
                 break;
             case 'B':
                 System.out.println("Great");
                 break;
             case 'C':
                 System.out.println("Good");
                 break;
             case 'D':
                 System.out.println("Passed");
                 break;
             case 'F':
                 System.out.println("Failed");
                 break;
             default:
                 System.out.println("Invalid");
         }
    }
}
