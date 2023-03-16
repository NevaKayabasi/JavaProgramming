package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers = { 10, 5 , 4, 20, 1 ,0};

         int sum = 0;
        for (int each : numbers) {
            sum  += each;

        }
        double avarage = sum / numbers.length;
        System.out.println(avarage);
    }
}
