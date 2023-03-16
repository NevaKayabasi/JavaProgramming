package TaskSolutions.day31;

public class Item {
    public String name;
    public double unitPrice ;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){

      return unitPrice*quantity;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total=" + calcCost()+
                '}';
    }

    public static void main(String[] args) {


        Item item1=new Item("Card",20,15);
        System.out.println(item1);

    }
}
  /*
  Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): retuns the name, unitPrice, quantity and total Price that's calculated by calcCost()
   */