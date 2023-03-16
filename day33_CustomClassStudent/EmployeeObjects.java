package day33_CustomClassStudent;

public class EmployeeObjects {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 100000;

        Employee employee2 = new Employee();
        employee2.name = "Neva";
        employee2.salary = 200000;

        Employee employee3 = new Employee();
        employee3.name = "Tarik";
        employee3.salary = 300000;


        System.out.println(employee1.name + " : " +employee1.salary);

    }
}