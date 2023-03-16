package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        //create a variable thats capable enough to contain 5 names

        String myGroups[] = new String[5];
        myGroups [0] = "Gunay";
        myGroups [1] = "Neira";
        myGroups [2] = "Suat";
        myGroups [3] = "Hulya";
        myGroups [4] = "Mikael";
        System.out.println(Arrays.toString(myGroups));


        System.out.println("---------------------------------------------------");

        String[] days = {"Monday" , "Teuesday" , "Wedaanasday" , "Thursday" , "Friday" , "Satur" , "Sunday"};
                    //     0           1             2              3            4          5          6
        System.out.println(Arrays.toString(days));
        int number = 5;

        if(number <1 || number >7){
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
