package TaskSolutions.day22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[][] array = { {1,2,3}, {4,5,6}};
        int [][] reversed = new int[2][];

        for (int i = array.length - 1, j= 0; i >= 0; i--,j++) {// j[0] = i[1]  // arrayler icin loop
                                                                // j[2] = i[0]
            reversed[j]  = array[i];

            for (int k = array[i].length-1,l=0 ; k >= 0; k-- ,l++) {
                reversed[j][k]= array[i][l];
            }

        }
        System.out.println(Arrays.deepToString(reversed));
        }

    }


/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};

 */