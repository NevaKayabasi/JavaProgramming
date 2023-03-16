package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversingNumbers {       //interview question

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};
                      // 0   1  2  3  4
        int[] reversed = new int [numbers.length];  // reversed kisimda ayni kapasite olmasi icin bunu yazdik
            /*approach is :
        reversed[0] = numbers[4];
        reversed[1] = numbers[3];
        reversed[2] = numbers[2];
        reversed[3] = numbers[1];
        reversed[4] = numbers[0];

             */
            for (int i = numbers.length-1 , j = 0; i >=0 ; i--, j ++) {
                reversed[j] = numbers[i];

            }
        System.out.println(Arrays.toString(reversed));
        }


    }

