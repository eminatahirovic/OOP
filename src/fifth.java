//Write a Java program that takes a temperature in Celsius as input and converts it to Fahrenheit. °F = °C * 9/5 + 32
import java.util.Scanner;
public class fifth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a temperature in celsius:");
        int celsius = Integer.parseInt(reader.nextLine());
        System.out.println("The temperature in farenheit is: " +  (celsius * 9/5 + 32));
    }
}
