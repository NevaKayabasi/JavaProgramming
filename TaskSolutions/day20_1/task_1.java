package TaskSolutions.day20_1;

import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {

                String[] names = {"Ayse Hava", "Gulsah Tosun", "Cevriye Turkmen", "Zehra Erkan", "Dilek Deniz", "Seyma Ergun" +
                        "Akile Altin", "Nazlican Semiz", "Suheda Pehlivan", "Zehra Memisbey"};

                for (int i = 0; i < names.length ; i++) {

                    String initial = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf("")+1);

                    System.out.println(initial);
        }

                }

            }







/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */