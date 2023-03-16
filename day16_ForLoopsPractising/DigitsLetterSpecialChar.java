package day16_ForLoopsPractising;

import java.lang.invoke.StringConcatFactory;

public class DigitsLetterSpecialChar {
    public static void main(String[] args) {

        String  str = "Cydeo12345Sc hool!@#$%WoodenSpoon";

        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialChars = "";// !@#$%

        for (int i = 0; i < str.length(); i++) { // i : index number of str
            char ch = str.charAt(i); //ch : every single char in str

            if (ch >= '0' && ch <= '9') { // if the char is between 0 and 9 then  is digits
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;

            }else{

                if (ch != ' '){
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);;
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
