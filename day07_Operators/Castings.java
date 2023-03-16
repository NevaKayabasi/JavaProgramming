package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte) averageScore; //explicit
        short num2 = (short)averageScore;// explicit
        int num3 = (int)averageScore;// exp;icit
        float num4 = averageScore; // there is no casting
        double num5 = averageScore; //implicit
        long num6 = (long) averageScore; //explicit


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 =" + num3);
        System.out.println("num4 =" + num4);
        System.out.println("num5 =" + num5);
        System.out.println("num6 =" + num6);

    }
}
