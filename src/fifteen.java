//Generate a random number between 1-100 and ask the user to guess it. Provide hints like "Too high!" or "Too low!"
// until they get it right. In order to generate random number add import java.util.Random; at top of the file and then use following syntax:
//Random random = new Random();
//int numberToGuess = random.nextInt(100) + 1;


import java.util.Random;
import java.util.Scanner;
public class fifteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        int guess = random.nextInt(100);
        System.out.println("Guess a number between 1-100");
        int numberToGuess = Integer.parseInt(reader.nextLine());
        while (numberToGuess != guess){
            if (numberToGuess > guess){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Too low!");
            }
        }
    }
}
