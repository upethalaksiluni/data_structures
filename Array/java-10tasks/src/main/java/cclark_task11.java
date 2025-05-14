import java.util.Scanner;

public class cclark_task11
{
    public static boolean isPositive(int num)
    {
        return num > 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        boolean positive = isPositive(num);
        System.out.println("The number is positive: " + positive);

        scanner.close();
    }
}
