package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90~100 excellent
        80-89 greta
        70-79 good
        60-69 passed
        0-50 failed
         */

        int score = 65;
        String grade = "";
        if(score>=0 && score<100){ // if the score is valid
            if(score >=90){ // false: score < 90
                grade = "Excellent";
            }else if(score>=80){ //false : score < 80
                grade = "Great";
            }else if(score >=70) {
                grade = "Good";
            }else if (score >= 60) {
                grade = "Passed";
            }else{
                grade = "failed";
            }

        }else {// if the score i not valid
            System.out.println("Invalid score");
        }
        System.out.println(grade);
    }


}
