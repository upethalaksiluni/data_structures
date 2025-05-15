import java.util.Scanner;

public class SumNatural
{
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find sum of natural numbers: ");
        int num = scanner.nextInt();
        System.out.println("Sum of first " + num + " natural numbers is: " + sum(num));
    }
}

