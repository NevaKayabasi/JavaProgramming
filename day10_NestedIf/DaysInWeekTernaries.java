package day10_NestedIf;

public class DaysInWeekTernaries {
    public static void main(String[] args) {
        int n1 = 3;
    String days =   (n1 == 1)? "Monday" :(n1==2)? "Tuesday" :(n1==3)? "Wednesday" :(n1==4)? "Thursday"
                :(n1==5)? "Friday" :(n1==6)? "Saturday" : "Sunday";
        System.out.println(days);
    }
}
