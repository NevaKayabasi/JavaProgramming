package day09_Ifstatement;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10, b= 15, c=20;
        if(a>b && a<c){
            System.out.println(a+ " is the median number");
        }
        if(b>a && b<c) {
            System.out.println(b+ " is the median number");
        }
        if(c>a && c<b){
            System.out.println(c+ "is the median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */