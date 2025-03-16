//Write a Java program with the following methods:
//printMessage(String message): Prints the given message.
//multiply(int a, int b): Returns the product of two integers.
//isEven(int num): Returns true if the number is even, otherwise false.

public class example {
    public static void main(String[] args) {
        String message = "This is the message";
        printMessage(message);

        int number = 6;
        boolean isEven = isEven(number);
        System.out.println("is " + number + " even? " + isEven);

        int a = 2;
        int b = 3;
        System.out.println(multiply(a,b));
    }

    public static void printMessage(String message) {
        System.out.println(message);

    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}
