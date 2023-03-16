package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] classmates = {"Anda Krasniqi", "Neda Krasniqi", "Ibrahim Mustafa", "Nurtene Mustafa", "Gent Mustafa", "Rona Mustafa",
                "Labinot Krasniqi"};
        System.out.println(classmates);
        for (String each : classmates) {
           String initial = each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1) ;
            System.out.println(initial);

        }
    }
}
