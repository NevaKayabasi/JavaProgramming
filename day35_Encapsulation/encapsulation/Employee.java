package day35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private int age;
    private int salary;
    private char gender;



    public Employee(String name, int age, int salary, char gender) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }



    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("Nsme cannot be empty");
            return; // if den cikar
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0 || age >90){
            System.err.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public void setSalary(int salary) {
        if (salary <=0){
            System.err.println("Invalid");
            return;
        }
        this.salary = salary;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M'|| gender== 'F')){
            return;
        }
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}






/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */