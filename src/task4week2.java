//Write a method printDiamond(int n) that prints a diamond pattern of stars for a given odd integer n.
// Example for n = 5:
//   *
// ***
//*****
// ***
//   *

    public class task4week2 {
        public static void main(String[] args){
            int n = 5;
            printDiamond(n);
        }

        public static void printDiamond(int n){
            if (n % 2 == 0) {
                System.out.println("Input an odd number");
                return;
            }

            for (int i = 1; i <= n; i += 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = n - 2; i >= 1; i -= 2) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
