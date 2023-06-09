package TaskSolutions.day21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_5 {
    public static void main(String[] args) {
      int[]  arr1 = {30, 10, 20};
      int[]  arr2 = {15, 40, 25, 35};
      int[]  arr3 = {8, 9, 17, 5, 4, 1};

      int[] merged = new int[arr1.length+ arr2.length+ arr3.length];
         int i =0;
        for (int ar1 :arr1){
            merged[i]= ar1;
             i++;

        }
        for (int ar2 :arr2){
            merged[i]= ar2;
            i++;

        }
        for (int ar3 :arr3){
            merged[i]= ar3;
            i++;

        }
        Arrays.sort(merged); //descending order
        System.out.println(Arrays.toString(merged));
    }
}
/*
 Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
 */