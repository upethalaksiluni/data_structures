import java.util.Scanner;

public class cclark_task8
{
    public static int cube(int num)
    {
        return num * num * num;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int cubed = cube(num);
        System.out.println("The cube is: " + cubed);

        scanner.close();
    }
}
