package day06_PrimativeTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;

        // short b = (short)a;
        // (short)a this is what is happening in the background

        int c = b; // implicit casting
        // int c = (int)b in the background

        long d = c;
        //       (long)c

        float e = d;
        double f = e;

        System.out.println(".......................");



        int x = 55;
        short y = (short) x; //explicit casting

        System.out.println(x + " : " + y);

        long j = 100000;
        short k = (short)j;

        System.out.println(j + ":" + k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l +":" + m);

        double n = 10.8;
        int s = (int) n; // it will become 10 instead of 10.8

        System.out.println(n +":" + s);

        System.out.println("..................");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + ":" + s1);







    }



}
