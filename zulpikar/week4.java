package zulpikar;

public class week4 {
    public static void main(String[] args) {
        int total = 2000;
        double discount = total - (total * 10 / 100);
        if (total >= 1000) {
            System.out.println("You get discount");
            System.out.println(discount);

        }else{
            System.out.println("You do not get discount");
        }

        System.out.println("--------------");
        int age = 6 ;
        if(age>0 || age <=2){
            System.out.println("Kids should stay at home");
        }else if(age>=3 || age<=6){
            System.out.println("Kids should go to kindergarten");
        }else if(age >=7 || age <=12){
            System.out.println("Kids should go to primary shcool");
        }else{
            System.out.println("Enter a proper number");
        }
        System.out.println("==============================================");


    }
}
