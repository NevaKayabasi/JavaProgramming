package day23_CustomMethods_Void;

public class C_M_WithParameters {

    public static void main(String[] args) {

      //  EvenOrOdd();   //method demands additional info to complete its task
        EvenOrOdd(10); // integer yazmak zorundayiz cunku altta intiger olarak tanimladik

        System.out.println("------------------------------");

        ageOfPerson(1986);

        printNumbers(1000,2000);


    }

    //create a function that can check if a number even or odd
    public static void EvenOrOdd(int number){
        if (number %2== 0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }

    } //10 icin iceri kontrol edilecek


    //create a function taht can display the age of the person
    public static void ageOfPerson(int birthyear){

        int age = 2022 - birthyear;
        System.out.println("your age is: "+age);
    }


    //creta a function that can print all the numbers between x and y
    public static void printNumbers(int x , int y ){

    }

}
