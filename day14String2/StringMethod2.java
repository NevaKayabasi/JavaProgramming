package day14String2;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Phyton"); // java yerine phyton yazar

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
       String email2 =  email.replace("yahoo" , "gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Phyton Phyton C# C# Phyton Phyton Phyton" ;
       String sentence2 =  sentence.replace("Phyton" , ""); // Phytonlari siler
        String sentence3 = sentence2.replace("   " , " ");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);


        System.out.println("-------------------------------------------");

        String s = "Dog Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog" , "cat");

        System.out.println("s = " + s);

        System.out.println("-------------------------------------------");
        
        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Phyton");
        System.out.println("result = " + result);

        String result2 = "C# is fun , Java is cool";
        result2 = result2.replaceFirst("C#" , "Java");

        System.out.println(result2);

        String result3 = "Java"; // ilk a yi degistirmek icin
        result3 = result3.replaceFirst("va" , "o"); // Joa ilk harfi alir unutma cunku tek o yerine gecece
        System.out.println(result3);





    }
}
