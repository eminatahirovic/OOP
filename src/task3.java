//Write a method printDiamond(int n) that prints a diamond pattern of stars for a given odd integer n. Example for n = 5:
//   *
// ***
//*****
// ***
//   *



public class task3 {
    public static void main(String[] args) {
        int n = 5;  // Example input
        printDiamond(n);
    }

    public static void printDiamond(int n) {
        // First loop: print the upper half of the diamond, including the middle row
        for (int i = 1; i <= n; i += 2) {
            // Print leading spaces
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Second loop: print the lower half of the diamond (excluding the middle row)
        for (int i = n - 2; i >= 1; i -= 2) {
            // Print leading spaces
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
