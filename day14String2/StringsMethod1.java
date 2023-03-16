package day14String2;

public class StringsMethod1 {
    public static void main(String[] args) {

        String str1 = "       batch 25      "; // burdaki bosluklari kaldirmaya yarar. aradaki degil kenardaki

        str1 = str1.trim(); // batch 25 a cevirir
        System.out.println(str1);
        
        
        String str2 = "Cydeo School";
      int n1  = str2.indexOf("h");   //8
        System.out.println("n1 = " + n1);
        
       int n2=  str2.indexOf("ool");  //9
        System.out.println("n2 = " + n2);
        

        String str3 = "Java Programming Language";
        
        int n3 = str3.indexOf("a "); // a dan sonra gelen bosluk onu bulmaya yardimci olir, 2. a
                            //"amm"  cumldeki 4. a yi bulur mm yi yazmaz
        System.out.println("n3 = " + n3);

        int n4 =  str3.indexOf("g"); // ilk g yi bulur
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("gua"); // 2. yi g yi bulur
        System.out.println("n5 = " + n5);

        int n6 = str3.lastIndexOf("g"); // sondan baslar yani sagdan
        System.out.println("n6 = " + n6);

        System.out.println("-------------------------");
        
        String s = "Java Nova Cava Wawa Orange";
        int firstA= s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int forthA = s.indexOf("ava W"); // ilk a bulur
        //int forthA = s.lastIndexOf("av");
        int forthA = s.lastIndexOf("Ca") + 1; // 1 ekledik cundu once C yi bulur
        int fifthA = s.lastIndexOf("va") + 1; // v yi bulur bir ekleyerek a nin sirasini buluruz
         int sixthA = s.lastIndexOf("aw");    
         int seventhA = s.lastIndexOf("a");
        
        
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        
    }
}
