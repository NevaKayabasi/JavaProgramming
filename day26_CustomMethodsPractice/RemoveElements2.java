package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers,1);  //it creates new array{100, 300, 400, 500, 600}

        numbers = removeElement(numbers,1); //it creates new array{100, 400, 500, 600}

        System.out.println(Arrays.toString(numbers));


    }




    // removes the index from the array,returns new array
    public static int[] removeElement(int[] array,int index){


        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);

        }

        int[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index){
                 result = ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }




    // removes the index from the array,returns new array
    public static double[] removeElement(double[] array,int index){


        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);

        }

        double[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }




    // removes the index from the array,returns new array
    public static char[] removeElement(char[] array,int index){


        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);

        }

        char[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }



    // removes the index from the array,returns new array
    public static String[] removeElement(String[] array,int index){


        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);

        }

        String[] result = {};
        for (int i = 0; i < array.length; i++) {
            if (i != index){
                result = ArraysUtility.addElement(result,array[i]);
            }

        }
        return result;
    }

}
