package day26_CustomMethodsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement1 {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers,1);  //it creates new array{100, 300, 400, 500, 600}

        numbers = removeElement(numbers,1); //it creates new array{100, 400, 500, 600}

        System.out.println(Arrays.toString(numbers));


    }


   // removes the index from the array,returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index");
            System.exit(0);

        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (i == array[index]) { // if the element of the array is matching with the element at given index
                continue;
            }
            result[j++] = array[i];
        }
       return result;
    }




}
/*
2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array

 */