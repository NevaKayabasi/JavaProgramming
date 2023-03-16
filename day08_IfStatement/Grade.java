package day08_IfStatement;

public class Grade {
    public static void main(String[] args) {
        int score = 72;
        String  grade1;
        boolean score1 = score >= 90 && score<= 100;
        boolean score2 = score>= 80 && score< 90;
        boolean score3 = score >= 70 && score < 80;
        boolean score4 = score >= 60 && score <70;
        boolean score5 = score < 60 && score >=0;
        if (score1) {
            grade1 = "A";
        } else if (score2) {
            grade1 = "B";
        }else if(score3){
            grade1 = "C";
        } else if (score4) {
            grade1 = "D";
        }else if(score5) {
            grade1 = "F";
        }else{
            grade1 = "Invalid";
        }
        System.out.println("Grade is " + grade1);
        }
    }
