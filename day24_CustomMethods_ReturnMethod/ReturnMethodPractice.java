package day24_CustomMethods_ReturnMethod;

public class ReturnMethodPractice {
    public static void main(String[] args) {
     //find the max number 100~200
     int max =maxNumber(100,200);
        System.out.println(max);


     //multiply the max number by 2
        int multiplication =max * 2;
        System.out.println("multiplication = " + multiplication);
    }

    public static int maxNumber(int a,int b){
        int result=0;
        if (a>b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }




}
