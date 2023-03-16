package day15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {
        String str = "XcodeX";
        String result =  str.replace("x" , "a").replace("X" , "a");
                             // "acodex"                             acodea
        System.out.println(result);


    }
}
