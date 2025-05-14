import java.util.Scanner;

public class cclark_task15
{
    public static void convertDistance(double kilometers)
    {
        double miles = kilometers * 0.621371;
        double centimeters = kilometers * 100000;

        System.out.println("The distance in miles is: " + miles);
        System.out.println("The distance in centimeters is: " + centimeters);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        convertDistance(kilometers);

        scanner.close();
    }
}
