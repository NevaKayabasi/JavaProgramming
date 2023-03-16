package day16_ForLoopsPractising;

public class UniqueCharacters  {
    public static void main(String[] args) {

        String str = "abadbdcbcadxfcfc";
        String result= "";

        for (int i = 0; i < str.length(); i++) { // i : is index numbers startin from zero
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // ilk ve son karakter ayni ise unique degil
                result += ch;
            }



                // unique olani bulma bu sekilde olur
        }System.out.print(result);

    }
}
/*
 Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */