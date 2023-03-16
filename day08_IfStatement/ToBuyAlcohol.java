package day08_IfStatement;

public class ToBuyAlcohol {
    public static void main(String[] args) {
        String name = "John";
        int year = 21;
        if(year >= 18){
            System.out.println(name + " is allowed to buy alcohol");
        }else{
            System.out.println(name + " is not allowed to buy alcohol");
        }
    }
}
