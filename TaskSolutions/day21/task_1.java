package TaskSolutions.day21;

import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] integer = {10 , 20 , 15 , 3 , 78};
        int [] reversed = new int[integer.length];

        Arrays.sort(integer); // 3, 10,15,20,78

        for (int i = integer.length-1,j=0; i >=0 ; i--,j++) {
            reversed[j]= integer[i];


        }
        System.out.println(Arrays.toString(reversed));
    }
}
