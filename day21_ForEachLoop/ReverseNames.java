package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Anda Krasniqi", "Neda Krasniqi", "Ibrahim Mustafa", "Nurtene Mustafa", "Gent Mustafa", "Rona Mustafa",
                "Labinot Krasniqi"};
        for (String each : names) { //
           String reversed  = "";

            for (int i = each.length()-1; i >=0; i--) {
                reversed += each.charAt(i);

            }

            System.out.println(reversed);
        }
    }
}
