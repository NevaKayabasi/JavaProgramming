package day25_CusomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum =sumOfTwoNumbers(10,20);
        System.out.println("sum = " + sum);

        int sum2 =sumOfThreeNumbers(15,20,45);
        System.out.println("sum2 = " + sum2);

        int sum3=sumOf4Numbers(14,65,85,63);
        System.out.println("sum3 = " + sum3);

    }
    
    
    public static int sumOfTwoNumbers(int num1,int num2){
        return num1+num2;


    }

    public static int sumOfThreeNumbers(int n1,int n2,int n3){
        return n1+n2+n3;

    }

    public static int sumOf4Numbers(int n1,int n2,int n3,int n4){
        return n1+n2+n3+n4;
    }
}


/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */