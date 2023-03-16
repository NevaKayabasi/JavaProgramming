package day14String2;

public class EmailDomain {
    public static void main(String[] args) {
        String email1 = "Neva.Kayabasi@gmail.com";
        // domain :
        int beginningIndex = email1.indexOf("@") + 1;
        int endingIndex = email1.lastIndexOf(".");

        String domain = email1.substring(beginningIndex,endingIndex);
        System.out.println(domain);

        System.out.println("------------------------------------");

        String str1 = "Java is fun,Java is cool";
                     //123456789
       String s1 =  str1.substring(0 , 10);


    }
}
/*
Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo


 */