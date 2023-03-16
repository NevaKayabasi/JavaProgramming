package day30_CustomClasses;

import java.util.ArrayList;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5 = new Employee();
        
        
        
        emp1.setInfo("Neva",245, "Tester", 120000,true);
        emp2.setInfo("Rifat", 255 ,"Teacher",150000, true);
        emp3.setInfo("Firat", 455 ,"Tester",140000, false);
        emp4.setInfo("Tarik" , 654 , "Tester" ,160000, false);
        emp5.setInfo("Bahadir",636,"Doctor", 200000, true);
        
       
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);



        Employee[] employees = {emp2,emp2,emp3,emp4,emp5};
        
        int countFullTime = 0;
        double max = employees[0].salary;
       double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
               countFullTime++;
            }
            if (employee.salary>max){
                max = employee.salary;
        }
            if (employee.salary <min){
                min= employee.salary;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
