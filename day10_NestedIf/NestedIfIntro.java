
package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;
        if (score >= 0 && score < 100) { // if the score is valid


            if (score >= 60) { // if student passed exam
                System.out.println("Passed");
            } else {//if the student failed the exam
                System.out.println("Failed");
            }
        } else { // if the score is invalid
            System.out.println("Invalid score");

        }
        System.out.println("/////////////////////////////////");
        int age = 21;
        boolean hasId = true;
        if(hasId){
            if (age >= 18){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("not Eligible to buy alcohol");
            }
        }

        System.out.println("///////////////////////////////////");

        int day = 3; //1~7
        //String day;
        if(day >= 1 && day<=7){
        if(day == 1){
            System.out.println("The day is monday");
            // day = "Monday"
        } else if (day == 2) {
            System.out.println("The day is tuesday");
        }else if(day == 3){
            System.out.println("The day is wednesday");
        }else if(day == 4){
            System.out.println("The day is thursday");
        } else if (day == 5) {
            System.out.println("The day is friday");
        } else if (day == 6) {
            System.out.println("The day is saturday");
        }else  {
            System.out.println("The day is sunday");
        }


    }else{
            System.out.println("Invalid number");
        }

    }
}
