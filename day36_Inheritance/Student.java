package day36_Inheritance;

public class Student {

    private String name;
    private int age;
    private char gender ;
    private String schoolNAme;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getSchoolNAme() {
        return schoolNAme;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSchoolNAme(String schoolNAme) {
        this.schoolNAme = schoolNAme;
    }
}
/*
1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName
			Encapsulate all the fields (at least encapsulate two fields manually)
					requirements:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'
			Add a constructor that can set all the fields when the object is created
						(requirements of fileds in the above must be applied)
			Methods:
				study()
				toString()
 */