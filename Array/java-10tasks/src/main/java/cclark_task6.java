import java.util.Scanner;

public class cclark_task6
{
    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        boolean even = isEven(num);
        System.out.println("The number is even: " + even);

        scanner.close();
    }
}
