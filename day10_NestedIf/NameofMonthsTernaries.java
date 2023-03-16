package day10_NestedIf;

public class NameofMonthsTernaries {
    public static void main(String[] args) {
        int n2 = 9;
      String result4 =  (n2==1)? "January" :(n2==2)? "February" :(n2==3)? "March"
                :(n2==4)? "April" :(n2==5)? "May" :(n2==6)? "June"
                :(n2==7)? "July" :(n2==8)? "August" :(n2==9)? "September"
                :(n2==10)? "October" :(n2==11)? "November" : "December";
        System.out.println(result4);




    }
}
