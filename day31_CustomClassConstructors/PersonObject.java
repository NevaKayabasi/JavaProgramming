package day31_CustomClassConstructors;

public class PersonObject {
    public static void main(String[] args) {

       Person person1 =  new Person("Daniel", 'M',32 );



        Person person2 = new Person("Neva" , 'F',36);
        person2.age = 30; // yasi degistirmek icin

        System.out.println(person1);
        System.out.println(person2);


    }
}
