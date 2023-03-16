package day14String2;

public class StringMethods3 {
    public static void main(String[] args) {
        // substring (begining index and ending index)

        String word = "Cydeo School";
        //             01234 5678910
        String brand = word.substring(0 , 4);
        System.out.println(brand);

        String str1 = word.substring(6);
        System.out.println(str1);

        String word2 = "JAva Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); // Java ilk index J den son index bosluga kadar alirsam Java yi elde ederim
        String s2 = word2.substring(word2.indexOf(" ")+1 , word2.lastIndexOf(" ") );// Programming
        String s3 = word2.substring(word2.lastIndexOf(" ")+ 1  );//Language

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
