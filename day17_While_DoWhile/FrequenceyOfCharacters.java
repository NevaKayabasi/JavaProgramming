package day17_While_DoWhile;

public class FrequenceyOfCharacters {
    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i : indexes of str
            char eachChar = str.charAt(i); // each character of str

            // 'A' ==
            if (ch == eachChar){ // verilenle eslesen ayni ise
                frequency++;
                //frequency += 1;

            }


        }System.out.println(frequency);
    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */