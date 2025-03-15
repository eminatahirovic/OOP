//Write a for loop that prints numbers from 1 to 50, but:
//If the number is divisible by 3, print "Fizz".
//If the number is divisible by 5, print "Buzz".
//If the number is divisible by both, print "FizzBuzz".

public class task1week2 {
    public static void main(String[] args){
        for(int i=1; i<=50; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if( i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
