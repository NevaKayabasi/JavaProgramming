package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Neva");

        System.out.println(employee1);

        Employee employee2 = new Employee("Tarik" ,'M');

        Employee employee3 = new Employee("Olga", 'F', "SDET");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
