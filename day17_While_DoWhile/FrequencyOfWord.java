package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String  str = "JAVAJAVAJAVAJAVA";

        int frequency = 0;

        for (int i = 0; i < str.length()-4 ;i++) {
            String eachSub = str. substring(i,i+4);
            //System.out.println(eachSub);

            if (eachSub.equals("JAVA")){
                frequency++;
            }


        }
        System.out.println(frequency);
    }
}
