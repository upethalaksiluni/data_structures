import java.util.Scanner;

public class cclark_task19
{
    public static double findAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double c = scanner.nextDouble();

        double average = findAverage(a, b, c);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }
}