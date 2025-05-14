import java.util.Scanner;

public class cclark_task7
{
    public static int square(int num)
    {
        return num * num;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int squared = square(num);
        System.out.println("The square is: " + squared);

        scanner.close();
    }
}
