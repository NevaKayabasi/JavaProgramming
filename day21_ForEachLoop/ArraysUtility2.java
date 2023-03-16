package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
         String[] students = {"Elif", "Sinem","Gunay","Cihad","DAvid","James","Aaron","DAniel"};

        String[] earlybirds = (Arrays.copyOf(students,3));

        System.out.println(Arrays.toString(earlybirds));
    }
}
