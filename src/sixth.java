//Ask the user to enter a number and determine whether it is even or odd.
import java.util.Scanner;
public class sixth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        if (number % 2 != 0){
            System.out.println(number + " is odd");
        }
    }
}
