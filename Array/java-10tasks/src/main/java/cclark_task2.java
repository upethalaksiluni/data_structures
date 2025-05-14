import java.util.Scanner;

public class cclark_task2
{
    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int first = scanner.nextInt();

        System.out.println("Enter Second Number: ");
        int second = scanner.nextInt();

        int product = multiply(first, second);
        System.out.println("The product is: " + product);

        scanner.close();
    }
}
