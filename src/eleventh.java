//Ask the user to enter a password. If it matches "JavaRocks", print "Access Granted!", otherwise "Access Denied!".

import java.util.Scanner;
public class eleventh {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = reader.nextLine();
        if (password.equals("JavaRocks")){
            System.out.println("Access granted!");
        }
        else {
            System.out.println("access denied");
        }
    }
}
