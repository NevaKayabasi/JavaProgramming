package TaskSolutions.day28;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(i+1)){
                System.out.println(list.get(i));
                break;
            }

        }



    }


}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2

 */