import java.util.Scanner;

public class cclark_task9
{
    public static double calculatePerimeter(double radius)
    {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius: ");
        double radius = scanner.nextDouble();

        double perimeter = calculatePerimeter(radius);
        System.out.println("The perimeter of the circle is: " + perimeter);

        scanner.close();
    }
}
