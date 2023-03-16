package day25_CusomMethod_Overloading;


public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // add 7
        addElement(arr,7);

        char[] arr4 = {'j','a','v','a'}; // 'E
        addElement(arr4,'E');

        String[] arr3 = {"Neva", "Sevgi", "Kayabasi" }; //LAyan
       arr3 = addElement(arr3,"Bahadir");
    }



    //1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;


    }



    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }



    //    3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    //  4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array,char element){
        char[] result = new char[array.length+1];
        int i =0;
        for (char each : array) {
            result[i++] = each;

        }
        result [i] = element;
        return result;

    }

}
