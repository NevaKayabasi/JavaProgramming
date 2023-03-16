package TaskSolutions.day21;

public class task_3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int eachOne : arr1) {
            for (int eachTwo : arr2) {
                if (eachOne==eachTwo){
                    System.out.print(" " +eachOne);
                }
            }
        }

        }
    }

/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */