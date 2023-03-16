package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("number= " + number);

        number = 200;
        System.out.println("number= " + number);



        String word = "Java";
        System.out.println("word = " + word) ;

        word = "Cydeo";
        System.out.println("word = " + word) ; // her zman son atanan kelimeyi hatirlar

        int x = 100;

        System.out.println("x = "+ x );
        System.out.println(x + 200);

        String str ="Wooden";
        str += " Spoon";

        System.out.println(" str =" + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);

        num1 += 5.5;

        System.out.println("num1 = " + num1); //8.0


        System.out.println("......");

        double salary = 50000.5;

        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        double dodge = 0.000001;
        dodge *= 10000000;
        System.out.println("dodge = " + dodge);

        double num2 = 25000;
        num2 /= 5;

        System.out.println("num2 = " + num2);
        // num2 = num2 / 5;

        System.out.println("......");

        int num3 = 100;
        // %/ reminder

        num3 %= 3;

        System.out.println("num3 = " + num3);
        System.out.println("......");

        int amount = 127; //cents

        int quarters = 127/ 25;
        int cents = 127 % 25 ;
        System.out.println("cents = " + cents);
        System.out.println("quarters = " + quarters);



    }
}
