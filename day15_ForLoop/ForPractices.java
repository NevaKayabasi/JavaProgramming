package day15_ForLoop;

public class ForPractices {
    public static void main(String[] args) {
        // 15 to 45
        for (int  i = 15 ; i <= 45; i++){ // i : 15,16,17....45
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------");

        for(int i2 = 100 ; i2 >= 50 ; i2--){ //100, 99 ,98...50 ( >, <, <= , >=) kullanilir sadece
                            //i>49
            System.out.print(i2 + " ");

        }
        System.out.println();
        System.out.println("--------------");

        // print all the even numbers between 1 ~ 55

        for(int i3 = 1 ; i3 <=55 ; i3++){
            if(i3 % 2 == 0){
                System.out.print(i3 + " ");
            }


        }
        for ( int i =2 ; i <=54 ; i += 2 ){
            System.out.print(i + " ");
    }

    }
}
