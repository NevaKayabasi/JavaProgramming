package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each :str.toCharArray()){ // tek tek harfleri yazdirir
            System.out.println(each);


        }
        System.out.println("_______________________________________");
       String sentence = "Wooden Spoon";
      String[] words=  sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        String email = "WoodenSpoon@cydeo.com";
         String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------------------");

        String s = "Yeni çiftlikte ikilinin hayali gerçek olmaya daha da yaklaşır. Yaşlı ve bir elini çiftlikte kaybetmiş bir işçi olan Candy, ikiliyle parasını birleştirmeyi ve böylece ay sonunda hayallerindeki çiftliği satın almayı önerir. Ancak bu hayal, çiftlik sahibinin oğlu olan Curley’nin genç ve güzel karısının Lennie tarafından saçını okşamaya çalışırken yanlışlıkla öldürülmesiyle suya düşer. Curley hemen bir linç grubu oluşturur. ";

         String[] arr2 =s.split("\\. "); // notadan sonra cumleleri ayirip array yapmak icin
                                               // yapmamiz gerekesn noktadan once \\ koymak
        System.out.println(Arrays.toString(arr2));

    }
}
