import java.util.Scanner;

public class cclark_task3
{
        public static double toFahrenheit(double celsius)
        {
            return (celsius * 9/5) + 32;
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = toFahrenheit(celsius);
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

            scanner.close();
        }
}

