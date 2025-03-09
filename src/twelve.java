//Take a username and password as input. If the username is "admin" and password is "1234", print "Welcome, Admin!", otherwise deny access.

import java.util.Scanner;
public class twelve {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an username:");
        String username = reader.nextLine();
        System.out.println("Enter a password");
        String password = reader.nextLine();
        if (username.equals("admin") && password.equals("1234")){
            System.out.println("Welcome Admin");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
