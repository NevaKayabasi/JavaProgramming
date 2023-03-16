package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        //A===>Z ASCII table   65~ 90

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();

        System.out.println("_------------------_");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("_------------------_");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_------------------_");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("_------------------_");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("_------------------_");

        for(char ch = 1 ; ch <=4000 ; ch++){
            System.out.print(ch + " ");
    }
        System.out.println();
        }

    }
/*
A~Z
a~z
Z~A
z~a
 */