package day09_Ifstatement;

public class PosNegZero
{
    public static void main(String[] args) {
        int n = -100;

        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }
}
