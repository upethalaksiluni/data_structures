import java.util.Scanner;

public class Factorial
{
    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0)
            return 1;
        // Recursive case: multiply n with factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Case 1: Display the number
        System.out.println("Number is: " + number);

        // Case 2: Handle negative input
        if (number < 0) {
            System.out.println("Error: Factorial is undefined for negative numbers.");
            System.exit(1);
        }

        // Calculate factorial
        int result = factorial(number);

        // Print the output
        System.out.println("Factorial of " + number + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}

