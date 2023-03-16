package day37_Inheritence.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "Small", "White");


        dog1.bark();


        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");

        cat1.scratch();


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();



    }
}