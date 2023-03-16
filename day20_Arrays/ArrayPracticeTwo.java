package day20_Arrays;

import java.util.Arrays;

public class ArrayPracticeTwo {
    public static void main(String[] args) {
        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;

        }
        System.out.println(Arrays.toString(letters)); // A~Z
        System.out.println("===============================================");


        char[] letters2 = new char [26];

        char ch = 'Z';
        for (int i = 0  ; i < letters.length;i++) {
            letters2[i] = ch--;


        }
        System.out.println(Arrays.toString(letters2));

    }
       // char ch = 'A';
       // for (int i = 0; i < letters.length ; i++) {
           // letters[i] = ch++ ;

    }

