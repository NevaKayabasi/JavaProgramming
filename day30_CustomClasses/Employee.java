package day30_CustomClasses;

public class Employee {

    public String name;
    public int ID;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;

    public void setInfo(String name, int ID, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }


    public void work(){System.out.println(name+ " : is working");}

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
