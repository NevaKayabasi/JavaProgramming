package zulpikar;

public class week5 {
    public static void main(String[] args) {

        String str = "Home";

        String reverse = "";



         for (int i = str.length(); i >0 ; i--){
             reverse += str.charAt(i);
         }
        System.out.println(reverse);
    }
}
