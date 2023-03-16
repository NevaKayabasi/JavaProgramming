
package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Aaron";
         int age = 19;
         String citizen = "UK";

         boolean isEligible = age >= 18 && citizen == "USA";
         //                     true  &&    false ====> false olur ciktisi (truth table a gore)

        System.out.println(name + "is Eligible to vote: = " + isEligible);

        System.out.println("..................................................");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60000 ;
        System.out.println(name + "isEligible for loan:  = " + isEligible2);


        System.out.println(".........................................");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isElegible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
                    //         true    &&    (  false       || true     ) ===> true || icin
                    //          true   &&     true  =====> true

   String student = "Anna";

   double gpa = 2.5;
   int familyIncome = 100000;

   boolean isEligible4 = gpa >= 3.5 || familyIncome <= 60000;
//                        false     ||    true  =====>   true    
        System.out.println(student  + " is eligible for scolarship: "+ isEligible4 );


        System.out.println("///////////////////////");
        
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("////////////////////////////");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);













    }
}
