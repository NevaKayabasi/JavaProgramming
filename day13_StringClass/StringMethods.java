package day13_StringClass;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
         String word = "Cydeo";
         
         char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);
        
       /*char tenthChar = word.charAt(9);
        // index number must be in the range of the word's letters
        System.out.println("tenthChar = " + tenthChar);
*/

        String s1 = "Ben senin beni sevebilme ihtimalini sevdim";
        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);
        
        char lastChar = s1.charAt(  s1.length()-1);
        System.out.println("lastChar = " + lastChar);

        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence);



        String str = "wooden spoon";
        str=   str.toUpperCase(); ///WOODEN SPOON

        System.out.println(str);


        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println(s);
                

        
         
    }
}
