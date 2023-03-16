package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0);
        System.out.println(num2 < 0);

        System.out.println(".........................");

        int a = 5;
        ++a; // pre increment increase by 1 rigth away

        System.out.println(a);

        --a; // pre dicrement decrases the value by 1 right away

        System.out.println(a);

        System.out.println(".........................");

        int b = 100;
        System.out.println(++b); //pre increment

        int c = 100;
        System.out.println(c++); //post increment: first passes the current value,then increaes the value by 1
        System.out.println(c);

        System.out.println(".........................");

        int x = 200;
        System.out.println(--x); // pre: decreases by 1 immaditely

        int y = 200;
        System.out.println(y--);//post: first passes the current value,then increaes the value by 1
        System.out.println(y); //199

        System.out.println(".........................");

        int z = 45;
        System.out.println(++z); //46 , z=46
        System.out.println(z++); // 46, z=47 bunu dgeri yani 47 asagida cikar
        System.out.println(z); //47

        int q = 30;
        System.out.println(--q); //30(current value), q=29
        System.out.println(q--); //29 ,q=28  degeri 29 dur consolda 29 cikar ama bi adim daha yapilir alttaki cikar
        System.out.println(q);//28




    }
}
