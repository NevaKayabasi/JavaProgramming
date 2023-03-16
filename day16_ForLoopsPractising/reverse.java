package day16_ForLoopsPractising;

public class reverse {
    public static void main(String[] args) {
        String str = "Muhtesem Neva";
        //  index:          0123456.....11
        String result = "";// contains the reverse version of str


        for (int i =str.length()-1 ; i >= 0; i--) { //i: is index numbers starting from last index to first

            result += str.charAt(i); // adding each character
        }

       ; //son karakteri verir (n)
      /*  result += str.charAt(10); //(o)
        result += str.charAt(9); //o
        result += str.charAt(8);//p
        result += str.charAt(7);//
        .
        .
        .
        until index zero

       */
        System.out.println(result);

    }
}
/*
Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */