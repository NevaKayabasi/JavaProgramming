package day09_Ifstatement;

public class MinNumber {
    public static void main(String[] args) {
        int n1 =100,
                n2 = 200;
       boolean n1isMin = n1<n2;
       boolean n2isMin = n2<n1;
       boolean equal  = n1 == n2;


      /*  if(n1<n2){
            System.out.println(n1 + " is the min number");
        }


       */
        if(n1isMin) {
            System.out.println(n1 + " is the min number");
        }
        if(n2isMin) {
            System.out.println(n2+ " is the min number");
        }
        if(equal){
            System.out.println(" numbers are equal");
        }
    }

/*
Ex:
n1= 100, n2 = 200;
output:
100 is the minimum number
n1 & n2
possibility #1: n1 is Min
possibility #2: n2 is Min
possibility #3: equal
 */
}
