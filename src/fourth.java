//Ask the user to enter two integers and print their sum, difference, product, and quotient.
import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an intger:");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another integer: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("The sum of" + number + "and" +number2 + "is" + (number + number2));
        System.out.println("the difference of " + number + " and " + number2 + " is" + (number - number2));
        System.out.println("the product of " + number + " and " + number2 + " is" + (number * number2));
        System.out.println("the quotient of " + number + " and " + number2 + " is" + (number / number2));
    }
}
