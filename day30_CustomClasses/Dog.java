package day30_CustomClasses;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed , int dogAge , char dogGender ,String dogSize ,String dogColor){
        name = dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;


    }


    public void eat(){
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");

    }

    @Override
    public String toString() {
        String msg =  "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
        return msg;
    }
}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */