//Write a program that asks for the user’s name and
// then prints "Hello, [name]! You are a future Java ninja".
import java.util.Scanner;
public class third {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = reader.nextLine();
        System.out.println("Your name is " + name + "! Yout are a future Java ninja!");
    }
}
