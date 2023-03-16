package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>(); //{10,20,30}

        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }

            result.add(each);
        }
        System.out.println(result);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);  // false ayri objectler cunku
        System.out.println(list1.equals(list2));


        System.out.println("-----------------------------------------");
        list1.clear();
        boolean r4 =  list1.isEmpty(); // true

        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------");


    }
}
