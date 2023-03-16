package day05_Concatenatoin;

public class ShippingAdress {
    public static void main(String[] args) {

        String name = "Neva Kayabasi",
                buldingNumber = "3AS bulding new",
                 streetName = "Wool",
                  city = "Dalby",
                  state = "Skane",
                   zipCode = "Ab234";

        String adress = name + "\n" + buldingNumber + " " + streetName + "\n" + city + " " + state + "," + zipCode ;
        System.out.println(adress);
       /* System.out.println(name);
        System.out.println(buldingNumber + "," + streetName);
        System.out.println(city + "," + state + " " + zipCode );
*/

        //System.out.println(name + "\n" + buldingNumber + " " + streetName + "\n" + city +" " + state + "," + zipCode);




    }
}
