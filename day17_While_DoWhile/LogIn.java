package day17_While_DoWhile;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your username:");
        String p = scan.next();

        if( u.equals("Cydeo") && p.equals("Cydeo123") ){
            System.out.println("Logged in");
        }else{
            int attemps = 3;

            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attemps > 0) {

                if(attemps == 1){
                    System.out.println("This is your last chance");
                }
                System.out.println("Incorrect username or password, re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your username:");
                p = scan.next();
                attemps--;
            }
            if( u.equals("Cydeo") && p.equals("Cydeo123") )
            {
                System.out.println("Logged in");
            }else{
                System.out.println("Locked");
        }

        }

    }
    }




/*
 You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



 */