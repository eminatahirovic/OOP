//Implement a method generateNumbers(int n) that returns an ArrayList<Integer> with the first n
// natural numbers.
import java.util.ArrayList;

public class task4week3 {

    public static ArrayList<Integer> generateNumbers(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = generateNumbers(5);
        System.out.println(numbers);
    }
}

