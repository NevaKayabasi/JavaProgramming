package day12_Scanner;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 5" +
                "1 to 7");
        int num = scan.nextInt();
        String result = "" ;

        if(num >=1 && num <= 7){

        result =    (num == 1 )? "Monday"  :(num == 2)? "Tuesday" :(num == 3)? "WEd"
                    :(num==4)? "Thu"  :(num == 5)? "Fri" :(num == 6)? "Sat" : "Sunday" ;

        }else{
            System.out.println("invalid");
    }
        System.out.println(result);
        scan.close();
    }

}
// weekdays