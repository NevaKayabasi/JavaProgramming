package TaskSolutions.day31;

public class Carpet {

    public double width, length, unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calCost(){

        double totalCost = width * length* unitPrice;


        if (isPersian){
            totalCost += 200;
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total=" + calCost() +
                '}';
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(2.3,5.0,20,true);
        System.out.println(carpet1);
    }

    /*5. Carpet Task:
            5.1create a custom class for the Carpet class that should contain the following:
    instance variables:
    width, length, unitPrice, isPersian (boolean)

    Add a constructor to set all the instances

    instance methods:

    calcCost(): should be able to calculate the total cost of the carpet and return it as double
    toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

    total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice
*/
}
