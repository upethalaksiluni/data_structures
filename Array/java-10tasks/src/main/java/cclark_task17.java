import java.util.Scanner;

public class cclark_task17
{
    public static double calculateVolume(double length, double width, double height)
    {
        return length * width * height;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double volume = calculateVolume(length, width, height);
        System.out.printf("Volume of the box: %.2f%n", volume);

        scanner.close();
    }
}
