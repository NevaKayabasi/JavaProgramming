package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String eachCharacters = " " +str.charAt(i); //"A "A "B" "B" "C" "C"
            if (result.contains(eachCharacters)) {
                continue;
            }
            result +=eachCharacters;

        }
        System.out.println(result);
    }
}
