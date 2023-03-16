package TaskSolutions.day20_1;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
           array = {10, 0, 5, 0, 1, 0};
                output:
                 {10, 5, 1, 0, 0, 0}
 */
public class task_6 {
    public static void main(String[] args) {
        int[]  array = {10, 0, 5, 0, 1, 0};
       int[] result = new int[array.length];

       Arrays.sort(array);
           int j = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] != 0){
                    result[j++] = array[i];
            }

            }

        System.out.println(Arrays.toString(result));
    }
}
