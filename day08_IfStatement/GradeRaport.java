package day08_IfStatement;

public class GradeRaport {
    public static void main(String[] args) {
        int score = 85;

        boolean a = score >=90 && score<= 100;
        //            false        true ========== false
        boolean b = score >= 80 && score<= 89; // score<=89 == !a
        boolean c = score >= 70 && !b;
        //boolean c= !a && !b ;
        boolean d = !a && !b && !c;
        boolean f = score >= 0 && score <= 59;
        // boolean f = !a && !b && !c && !d;

        if(a) {
            System.out.println("Excellent");
        }
        if (b) {
            System.out.println("Great");
        }
      if(c) {
            System.out.println("Good");
}
      if(d) {
          System.out.println("Passed");
      }
      if(f) {
          System.out.println("Failed");
      }
    }
}



/*
 score
 90 ~ 100 ===> excellent
 80~89=== Great
 70~79 === good
 60~69 ====Passed
 0~59 =====Failed

 */
