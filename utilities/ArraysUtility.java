package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer of an integer array in separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);

        }
    }



    // prints each double of a double array in separate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);

        }
    }



    // prints each char of a char in separate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);

        }
    }



    // prints each String of a String  in separate lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);

        }
    }



    //return max number from int array
    public static int max(int[] number){
        Arrays.sort(number);
        return number[number.length-1];
    }



    //return max number from double array
    public static double max(double[] number) {
        Arrays.sort(number);
        return number[number.length - 1];
    }



    //return min number from int array
    public static int min(int[] number) {
        Arrays.sort(number);
        return number[0];
    }




    //return min number from double array
    public static double min(double[] number) {
        Arrays.sort(number);
        return number[0];
    }



    // check if the given integer is contains in the given array,return boolean. contains (int[], int)
    public static boolean contains(int[] array , int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }




    // check if the given double is contains in the given array,return boolean. contains (double[], double)
    public static boolean contains(double[] array , double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }




    // check if the given char is contains in the given array,return boolean. contains (char[], char)
    public static boolean contains(char[] array , char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }




    // check if the given String is contains in the given array,return boolean. contains (String[], String)
    public static boolean contains(String[] array , String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }

        }
        return result;
    }


    //adds the given element to array ,returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;


    }



    //adds the given element to array ,returns a new array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }



    //adds the given element to array ,returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }



    //adds the given element to array ,returns a new array
    public static char[] addElement(char[] array,char element){
        char[] result = new char[array.length+1];
        int i =0;
        for (char each : array) {
            result[i++] = each;

        }
        result [i] = element;
        return result;

    }



    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array , int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array , double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }




    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array , char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }




    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String [] array , String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(array)) {
                count++;
            }
        }
        return count;
    }





    //returns the unique elements of an array as a new array
    public static int[] uniqueElements(int[] array){
        int [] result = {};   //new int[0]  it is temprorary
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ // if the freq is 1 the element is unique
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }


    //returns the unique elements of an array as a new array
    public static double[] uniqueElements(double[] array){
        double [] result = {};   //new int[0]  it is temprorary
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ // if the freq is 1 the element is unique
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }


    //returns the unique elements of an array as a new array
    public static char[] uniqueElements(char[] array){
        char [] result = {};   //new int[0]  it is temprorary
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ // if the freq is 1 the element is unique
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
    }



    //returns the unique elements of an array as a new array
    public static String[] uniqueElements(String[] array){
        String  [] result = {};   //new int[0]  it is temprorary
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ // if the freq is 1 the element is unique
                result =ArraysUtility.addElement(result,each);
            }

        }
        return result;
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



   //merges two arrays and returns new array
    public static int[] merge(int[]arr1 , int []arr2){

      int[] result = {};

      for (int each : arr1) {
          result = ArraysUtility.addElement(result, each);
      }

      for (int each : arr2) {
          result = ArraysUtility.addElement(result, each);
      }

      return result;




  }



  //merges two arrays and returns new array
    public static double[] merge(double[]arr1 , double []arr2) {

        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }



    //merges two arrays and returns new array
    public static char[] merge(char[]arr1 , char []arr2) {

        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }



    //merges two arrays and returns new array
    public static String[] merge(String[]arr1 , String []arr2) {

        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }



   // reverse the array and returns new array
    public static int[] reverse(int[] array){
        int[] result = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }


    // reverse the array and returns new array
    public static double[] reverse(double[] array){
        double [] result = new double[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }



    // reverse the array and returns new array
    public static char[] reverse(char[] array){
        char[] result = new char[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }



    // reverse the array and returns new array
    public static String[] reverse(String[] array){
        String[] result = new String[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j] = array[i];
            j++;
        }
        return result;
    }



    // replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index ,int newElement){

        if (index <0 || index> array.length-1){
            System.err.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }



    // replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index ,double newElement){

        if (index <0 || index> array.length-1){
            System.err.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }



    // replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index ,char newElement){

        if (index <0 || index> array.length-1){
            System.err.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }



    // replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index ,String newElement){

        if (index <0 || index> array.length-1){
            System.err.println("Invalid index: " +index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }



    // replaces all the matching old element with the new element
    public static int[] replaceAll(int[] array, int oldElement, int newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }


    // replaces all the matching old element with the new element
    public static double[] replaceAll(double[] array, double oldElement, double newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }



    // replaces all the matching old element with the new element
    public static char[] replaceAll(char[] array, char oldElement, char newElement){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement){
                array[i] = newElement;
            }

        }
        return array;
    }



    // replaces all the matching old element with the new element
    public static String[] replaceAll(String[] array, String oldElement, String newElement){

        for (int i = 0; i < array.length; i++) {
            if (array.equals(oldElement)){
                array[i] = newElement;
            }

        }
        return array;
    }


    //removes the duplicates from the given array,returns a new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }


    //removes the duplicates from the given array,returns a new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }



    //removes the duplicates from the given array,returns a new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }



    //removes the duplicates from the given array,returns a new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(result,each);

            }
        }

        return result;
    }


}

