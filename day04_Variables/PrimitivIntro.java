package day04_Variables;

public class PrimitivIntro {
    public static void main(String[] args) {
        // age: 38 years old byte araliginda -128 to 127

        // DataType VariableName = Data
            byte age = 38;

            // weight(y): 160 pounds short araliginda -32.768 to 32.767
        short y = 160;

         //  salary $100000 int araliginda - 2 billion to 2 billion sth for integer data

        int salary = 100000; // 100_000

        // long fazla kullanilmaz cok yer tutar.

        long asset = 3_333_333_333L;
        //bu long un kullanildigi tek senaryo. Sayinin sonuna L eklenir.

        // tax: 0.26

        float tax = 0.20F;

                double PI = 3.14;
                
                char ch1 = '#';
        System.out.println("ch1 = " + ch1); // tek karaketer kullanilacaksa
        
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        boolean isEmployed = true;
        // true or false da kullanilir

        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

     }
}
