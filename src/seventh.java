//Take an input score from the user and print the corresponding grade based on the following scale:
//90-100 → A
//80-89 → B
//70-79 → C
//60-69 → D
//Below 60 → F
import java.util.Scanner;
public class seventh {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a score:");
        int score = Integer.parseInt(reader.nextLine());
        if (score >= 90){
            System.out.println("Your score is A");
        }
        if (score >=80 && score < 90){
            System.out.println("Your score is B");
        }
        if (score >=70 && score < 80){
            System.out.println("Your score is c");
        }
        if (score >=60 && score <70){
            System.out.println("Your score is D");
        }
        if (score < 60){
            System.out.println("Your score is F");
        }
    }
}
