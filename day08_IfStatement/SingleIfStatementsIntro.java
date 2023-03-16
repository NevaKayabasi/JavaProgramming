package day08_IfStatement;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {
        int number = 301;
       /* System.out.println("Odd Number");

        System.out.println("Even Number");
        */

        boolean evenNumber = number%2 == 0;

        if (evenNumber) {
            System.out.println(number+ " is even number");
        }
        if (!evenNumber){
            System.out.println(number+ " is odd number");
        }

        int n = -200;
        //positiv
        if(n > 0) {
            System.out.println(n + "is positiv");
        }
        // negativ
        if(n<0) {
            System.out.println(n+ " is negativ");
        }
        // zero
        if(n==0){
            System.out.println(n+" is zero ");
        }




    }

}
