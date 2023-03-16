package day21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = {"Java Programming" ,"Cydeo School" , "Wooden Spoon" , "Early Birds","Angry Birds"};

        for (String eachElement : words){
            System.out.println( "" +eachElement.charAt(0) + eachElement.charAt(eachElement.length() - 1));
        }


// print first and last elements in the different lines

    }




}
