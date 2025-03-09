//Write a program that asks the user for their age and prints whether they are eligible to vote (18+).
import java.util.Scanner;
public class eigth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = Integer.parseInt(reader.nextLine());
        if (age >= 18) {
            System.out.println("You can vote");
        }
        if (age < 18) {
            System.out.println("you cant vote");
        }
    }
}
