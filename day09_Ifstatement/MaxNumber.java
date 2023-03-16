package day09_Ifstatement;

public class MaxNumber {
    public static void main(String[] args) {


        int a = 12, b = 25;
        boolean isnumber1 = a < b;
        boolean isnumber2 = b < a;
        if (isnumber1) {
            System.out.println(b + " is max number");
        } else {
            System.out.println(a + "is max number");
        }
    }
}