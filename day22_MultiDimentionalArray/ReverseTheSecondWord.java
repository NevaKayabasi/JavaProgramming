package day22_MultiDimentionalArray;

import java.util.Arrays;   // interview question

public class ReverseTheSecondWord {
    public static void main(String[] args) {
        String sentence = "I Love Java";  // love i ters cevirmemi istiyor,o halde ikinciyi tek almam lazim once

        String[] words = sentence.split(" ");

        String reverse="";
        for(int i = words[1].length()-1; i >=0; i--){ // ikinci kelime icin loop
            reverse += words[1].charAt(i);
        }
        System.out.println(reverse);

        // tersine cevrilen kelimeyi cumlede yerine koymak icin (iki yol )

        //sentence= sentence.replaceFirst(words[1],reverse);
        words[1] = reverse;

        System.out.println(Arrays.toString(words));

        for (String word : words) { // arrayden cikarip metin seklinde elde etmek icin
            System.out.print(word+ " ");

        }


    }
}



/*
 Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java


 */