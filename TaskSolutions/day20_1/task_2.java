package TaskSolutions.day20_1;

public class task_2 {
    public static void main(String[] args) {
        String[] names = {"Ayse Hava", "Gulsah Tosun", "Cevriye Turkmen", "Zehra Erkan", "Dilek Deniz", "Seyma Ergun" +
                "Akile Altin", "Nazlican Semiz", "Suheda Pehlivan", "Zehra Memisbey"};
        String reverse = "";

        for (int i = names.length; i >=0 ; i--) {
            reverse+= names;

        }
        System.out.println(reverse+ "\n");

    }
}
/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */