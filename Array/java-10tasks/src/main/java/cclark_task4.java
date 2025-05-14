import java.util.Scanner;

public class cclark_task4
{
    public static int findmax(int a, int b)
    {
        return Math.max(a, b);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        int max = findmax(num1, num2);
        System.out.println("The max is: " + max);

        scanner.close();
    }
}
