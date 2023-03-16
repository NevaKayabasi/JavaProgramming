package day19_LoopPractice;

public class UniqueCharacter {
    public static void main(String[] args) {

       String  str = "aabccdeef";
        String result = " ";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {// compares the chars outer loop picked

                char eachCha = str.charAt(i); // each character of str
                if(ch== eachCha){
                    count++;
                }

            }
            /*if (count==1) { // if the frequency is of the charc is 1,unique
                result =+ ch;
            }
            */
            if (count != 1) {
                continue;
            }
            result += ch;
        }


        System.out.println(result);


    }

}
/*

	2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */