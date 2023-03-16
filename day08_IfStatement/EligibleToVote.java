package day08_IfStatement;

public class EligibleToVote{
    public static void main(String[] args) {
        String name = "josh";
        int age = 38;
        String citizen = "USA";
        //Eligible
        boolean isEligible = age >= 21 && citizen == "USA"; //true

        if(isEligible){
            System.out.println("Eligible");  //true
        }

        if(!isEligible){
            System.out.println("Not eligible"); //not true== !true== false
        }
    }

}
