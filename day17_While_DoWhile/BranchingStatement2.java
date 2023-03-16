package day17_While_DoWhile;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {

            if (i == 'C') { // skips C
                continue;
            }
            System.out.println(i);

            System.out.println("_______");

            for (int j = 1;  j <=10; j++) {
                if (j % 2 != 0) {
                    continue; // skips odd numbers

                }
                System.out.println(j);
            }
            for (int m = 1; m <=10 ; m++) { // write odd numbers with continue
                if (m%2==0) {
                    continue;
                }
                System.out.println(m);
            }




        }
    }
}
