package day18_NestedLoop;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name:");
        String u = scan.next();

        System.out.println("Enter you password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
            System.out.println("Logged in");

        }else{
        for (int i = 0; i < 4; i++) {
            System.out.println("Incorrect user name or password");
            System.out.println("Enter your user name:");
            u = scan.next();

            System.out.println("Enter you password");
            p = scan.next();

            if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
                System.out.println("Logged in");
                break;
            }
               if (!(u.equals("Cydeo") && p.equals("WoodenSpoon")) ){
                   System.out.println("Locked");
            }
            }
scan.close();
        }
    }
}
 /*

        2. You are writing a code for the log-in function of the Cydeo Application,
        assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user
                         to have three attempts to enter correct credentials
                        and if all three attempts are failed, then print "Your account is locked."
  */