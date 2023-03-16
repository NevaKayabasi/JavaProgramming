package TaskSolutions.day31;

public class chef {


    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println( name + "is making an order");
    }

    public void washDishes(){
        System.out.println( name + "is washing the dishes");
    }

    @Override
    public String toString() {
        return "chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + ((fullTime)? "full Time" : "part time")  +
                '}';
    }

    public static void main(String[] args) {
        chef chef = new chef("Ayse",234,34.5,true);
        System.out.println(chef);
    }
}
  /*
  6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

			   Add A constructor that can set all the fields

		            Actions: (all void methods)
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
   */