//Ask the user for a number and print a countdown from that number to 1.

import java.util.Scanner;
public class thirteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        for (int i = number; i > 0; i--) {
            System.out.println(i);
        }
    }

}