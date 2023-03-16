package day10_NestedIf;

public class TernariesInfo {
    public static void main(String[] args) {
        int n = 100;
        if (n % 2 == 0) {
            System.out.println("even"); //string
        } else {
            System.out.println("Odd");//string
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

        String result1 = (n % 2 == 0) ? "even" : "odd";     // if block yerine

        System.out.println(result1);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        int age = 21;
        if (age >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");


        String result2 = (age>=21)? "eligible" : "not eligible" ;
        System.out.println(result2);

        // System.out.println((age>=21)? "eligible" : "not eligible" );


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

        int n2 = -200;
        String result3 = (n2>0)? "Pozitive" :(n2<0)? "Negative" : "Zero";
        System.out.println(result3);
    }



    }

