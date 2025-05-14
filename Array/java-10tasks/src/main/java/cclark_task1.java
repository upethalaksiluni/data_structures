import java.util.Scanner;

public class cclark_task1
{
    public static int addNumbers(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        int sum = addNumbers(first, second);
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
