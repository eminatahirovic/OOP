//Write a method countDigits(int n) that returns the number of digits in a given integer.
//Example: countDigits(4567) → 4

public class task7week2 {
    public static void main(String[] args){
        System.out.println(countDigits(4567));
    }
    public static int countDigits(int n) {
        int count = 0;
        if ( n == 0 ) {
            return 1;
        }
        while (n > 0) {
            count++;
            n /= 10;  // Remove the last digit
        }
        return count;
    }
}
