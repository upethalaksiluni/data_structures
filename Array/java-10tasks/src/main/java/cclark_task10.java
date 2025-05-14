import java.util.Scanner;

public class cclark_task10
{
    public static double calculateInterest(double principal, double rate, double time)
    {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter time in years: ");
        double time = scanner.nextDouble();

        double interest = calculateInterest(principal, rate, time);
        System.out.println("The interest is: " + interest);

        scanner.close();
    }
}
