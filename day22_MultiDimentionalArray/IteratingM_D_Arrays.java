package day22_MultiDimentionalArray;

import java.util.Arrays;

public class IteratingM_D_Arrays {
    public static void main(String[] args) {
        //                  0 1 2    0 1 2 3   0 1  2  3  4
        int [][] arr2D = {{1,2,3,},{4,5,6,7},{8,9,10,11,12}};
        //                    0       1          2

        for (int i = 0; i < arr2D.length; i++) {  // i :index of singel dimesion of arrays
           // System.out.println(Arrays.toString(arr2D[i]));
            for (int i1 = 0; i1 < arr2D[i].length; i1++) { // i1 : index of elements

                System.out.print(arr2D[i][i1]+" ");

            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++" );
    }
}
