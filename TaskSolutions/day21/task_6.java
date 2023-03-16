package TaskSolutions.day21;
/*6. Write a program that can return the number of appearances of
        “java” and “python” anywhere in the sentence.
        (similar to the task 97 in repl.it,
        but this time you MUST use arrays and for each loop)
*/
public class task_6 {
    public static void main(String[] args) {
        String[] str = {"Python","Java","Python","Java","Python","Java","Python","Python"};
        int java = 0;
        int python = 0;

        for (String each1 : str) {
            if (each1.equals("Java")){
                java++;
            }
        }
        for (String each2 : str) {
            if (each2.equals("Python")){
                python++;
            }

        }
        System.out.println("Java is :" + java + "\nPython is: "+ python);
    }
}
