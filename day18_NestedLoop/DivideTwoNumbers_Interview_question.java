package day18_NestedLoop;

public class DivideTwoNumbers_Interview_question {
    public static void main(String[] args) {
        int a = 30; // a = 30-7 = 23, 23-7 = 16 , 16- 7 = 9 , 9-7 = 2
                    //   count 1     , count 2  ,  count 3  , count 4
        int b = 7;

        int count = 0; // count=1

        while(a>=b){
            a -= b ;
            count++;
        }
        System.out.println(count + " with a reminder of " +a);


    }
}
/*
 1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2


                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */