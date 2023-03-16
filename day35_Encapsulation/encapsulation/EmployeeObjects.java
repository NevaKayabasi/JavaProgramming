package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 30, 300000, 'M');

        System.out.println(employee1);

        employee1.setAge(32);  // yasi ayri olarak degistirmek icin



        Employee employee2= new Employee("Aygun", 31, 200000, 'F');

        employee2.setName("Neva");
        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary() + 1500) ;
    }
}
