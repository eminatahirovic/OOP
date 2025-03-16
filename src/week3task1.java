//Write a Java program with the following methods:
//printMessage(String message): Prints the given message.
//multiply(int a, int b): Returns the product of two integers.
//isEven(int num): Returns true if the number is even, otherwise false.

public class week3task1 {
    public static void main(String[] args){
        String message = "This is the new message";
        System.out.println(message);

        int a = 4;
        int b = 3;
        System.out.println(multiply(a,b));

        int num = 6;
        boolean isEven = isEven(num);
        System.out.println("Is " + num + " even?");

    }
    public static void printMessage(String message){
        System.out.println(message);
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
