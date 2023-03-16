package day16_ForLoopsPractising;

public class RemovingDuplicates {
    public static void main(String[] args) {
        String word = "aabbcc"; // outout : abc
        String result = "";

        for (int i = 0; i < word.length() ; i++) { //represents all the index numbers of word
              String  ch = "" +word.charAt(i); //represents each character of word
            if (!result.contains(ch)){
            result +=ch; // the character will be added to the result
        }

    }System.out.println(result);
}}
/*
Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					aabbaacc

				Output:
					abac

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding

 */