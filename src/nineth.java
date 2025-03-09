//Ask the user to input two numbers and print which one is larger, or if they are equal.
import java.util.Scanner;
public class nineth {
    public static void main(String[] args){
        Scanner reader  = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Enter another numebr");
        int number2 = Integer.parseInt(reader.nextLine());
        if (number > number2){
            System.out.println(number + " is greater than" + number2);
        }
        if( number == number2) {
            System.out.println(number + " is equal to" + number2);
        }
        if (number < number2){
            System.out.println(number + "Is less than " + number2);
        }
    }
}
