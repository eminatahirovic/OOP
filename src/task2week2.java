//Write a while loop that repeatedly sums the digits of a number until only one digit remains.
//Example: 987 → 9 + 8 + 7 = 24 → 2 + 4 = 6





public class task2week2 {
    public static void main(String[] args){
        int number = 987;
        while(number >= 10){
            int sum = 0;
            while(number > 0){
                sum += number % 10;
                number /=10;
            }
            number = sum;
        }
        System.out.println("the sum is: " + number);
    }
}


//public class SumDigits {
//    public static void main(String[] args) {
//        int number = 987; // Example number
//        while (number >= 10) { // While the number has more than one digit
//            int sum = 0;
//            while (number > 0) {
//                sum += number % 10; // Add the last digit of the number
//                number /= 10; // Remove the last digit
//            }
//            number = sum; // Set the sum as the new number
//        }
//        System.out.println("The final single digit is: " + number);
//    }
//}