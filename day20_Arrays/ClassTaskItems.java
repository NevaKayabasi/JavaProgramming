package day20_Arrays;

public class ClassTaskItems {
    public static void main(String[] args) {

        String[] items ={ "Pants" ,"Gloves" , "T-Shirt" ,"Short" ,"Hat" };
        int[] prices = {20 , 10 , 12 , 15 , 20};

        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total += prices[i];
            System.out.println(items[i] + "--"+prices[i]);
        }



    }
}
/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
 */