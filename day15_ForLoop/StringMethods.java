package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str = "    ";
        boolean r = str. isEmpty();
        System.out.println(r);

        System.out.println("--------------");

       boolean r1 =  str.isBlank();
        System.out.println(r1);

        String str1 = "Cydeo      " ;

        System.out.println(str1.isEmpty());

        System.out.println("--------------");

        String s1 = "Cydeo";
        String s2 = "cyDeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("--------------");

        System.out.println("YeS".equals("Yes"));
        System.out.println("YEs".equalsIgnoreCase("YES"));

        System.out.println("--------------");

        String sentence = "My favorite programming language is Java";
        boolean hasCsharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("JAva");
        boolean hasJAva2 = sentence.contains("java");
        boolean hajava3 = sentence.toLowerCase().contains("java"); // ignores the lower or upper cae

        System.out.println(hasCsharp);
        System.out.println(hasJava);
        System.out.println(hasJAva2);
        System.out.println(hajava3);

        System.out.println("____________________");

        String input = "I love Java";
        String input2 = "Java";

        System.out.println(input.equals(input2));// false

        System.out.println(input.contains(input2));
                                        //"Java"

        System.out.println(input.toLowerCase().contains("java")); // ignores case sensevity
        System.out.println(input.toUpperCase().contains("JAVA"));//  the same

        System.out.println("--------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Wood"); // kontrols from index zero
        boolean y = a.endsWith("oon");
        boolean z = a.toLowerCase().startsWith("woo"); // in order to ignor case sensivity


        System.out.println(x);
        System.out.println(y);
    }
}
