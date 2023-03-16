package TaskSolutions.day21;

public class task_4 {
    public static void main(String[] args) {

        String[] str = {"anna", "level", "Java"};
        int count = 0;

        for (String names : str) {
            String palindrome = "";
            for (int j = names.length()-1 ; j >=0; j--) {
                palindrome += names.charAt(j);
                if (names.equals(palindrome)) {
                    count++;
                }
            }

            }
        System.out.println(count);
        }

    }

/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */