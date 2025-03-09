//Write a method collatzSteps(int n) that prints the sequence of numbers following these rules:
//If n is even, divide it by 2.
//If n is odd, multiply it by 3 and add 1.
//Stop when n == 1.
//Example: 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1

public class method {
    public static void main(String[] args){}
        public static void collatzSteps(int n){
            if (n % 2 == 0){
                System.out.println(n/2);
            }
            else if(n % 2 != 0){
                System.out.println((n*3) + 1 );
            }
            else if (n == 1){
                return;
            }
        }

    }

