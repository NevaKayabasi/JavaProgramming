package TaskSolutions.day31;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

   Movie newMovie = new Movie("USA","Journey to SDET: Cydeo Batch 25","Adventure, Comedy, Thriller",
"10/25/2021","Kuzzat Altay");

   String [] casts = {"Asiya", "Adam", "Muhtar", "Neva"};

        System.out.println(newMovie + " "+ " casts: "+"\n" + Arrays.toString(casts));
    }
}
/*
 3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */