import java.util.Scanner;

public class cclark_task5
{
    public static double calculateArea(double width, double height)
    {
        return width * height;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rectangle width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter rectangle height: ");
        double height = scanner.nextDouble();

        double area = calculateArea(width, height);
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}
