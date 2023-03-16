package day21_ForEachLoop;

public class UniqueElemenets {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan","Olenksandir","Olga", "Adam" , "Adam", "Adam", "Cihad","Cihad","Cydeo"};



        for (String each : words) {
            int frequency = 0;
            for (String Elements : words){
                if(Elements.equals(each)){
                    frequency++;
        }

        }
            if (frequency==1) {
                System.out.println(each);

            }

        }

    }
}
