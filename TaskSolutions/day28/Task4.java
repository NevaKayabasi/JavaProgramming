package TaskSolutions.day28;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

      String[]  arr1 = {"A", "B", "C"};
      String[]  arr2 = {"D", "E", "F", "G"};

        String [] merged = ArraysUtility.merge(arr1,arr2);

        ArrayList<String>  list = new ArrayList<>(Arrays.asList(merged));

        System.out.println(list);

    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */