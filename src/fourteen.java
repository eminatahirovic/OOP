//Ask the user for a number and print its multiplication table up to 10.

import java.util.Scanner;
public class fourteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number");
        int number = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " *" + i + " = " + number * i);
        }
    }
}
