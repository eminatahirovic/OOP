//Write a while loop that repeatedly sums the digits of a number until only one digit remains.
//Example: 987 → 9 + 8 + 7 = 24 → 2 + 4 = 6

public class task2 {
    public static void main(String[] args) {

        int number = 987;  // The number to start with

        while (number >= 10) {
            int sum = 0;
            // Sum the digits of the number
            while (number > 0) {
                sum += number % 10;  // Add the last digit to sum
                number /= 10;         // Remove the last digit
            }
            number = sum;  // Set the number to the sum of its digits
        }

        System.out.println("The single digit is: " + number);

    }
}