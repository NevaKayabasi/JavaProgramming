package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {

        String [] group1 = {"John" ,"Neva","JAmes"};
        String [] group2 = {"Tarik" ,"Leo","Rifat"};
        String [] group3 = {"John" ,"Joes","Bahadir"};

       String [][] groups = new String[3][]; //index; 0, 1, 2
       groups[0]= group1;
       groups[1] = group2;
       groups[2]= group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("_________________________________________________________");

       //                  0 1 2    0 1 2 3   0 1  2  3  4
        int [][] arr2D = {{1,2,3,},{4,5,6,7},{8,9,10,11,12}};
        //                    0       1          2

       // to get {4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));

        // to get 11
        System.out.println(arr2D[2][3]);




    }
}
/*
String [] group1 = {"John" ,"Joes","JAmes"}
String [] group2 = {"John" ,"Joes","JAmes"}
String [] group3 = {"John" ,"Joes","JAmes"}
 */