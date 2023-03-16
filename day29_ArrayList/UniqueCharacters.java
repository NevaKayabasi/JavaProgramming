package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

       String[] arr =  str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));// String i String array yapar atama yapar

        System.out.println("list = " + list);
        
        String unique = "";

        for (String each : list) {
            int frequency = Collections.frequency(list,each);
            if (frequency==1){
                unique += each;
            }
            
        }
        System.out.println("unique= " + unique );
    }
}
