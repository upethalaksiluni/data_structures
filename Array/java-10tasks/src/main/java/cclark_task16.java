import java.util.Scanner;

public class cclark_task16
{
    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean leapYear = isLeapYear(year);
        System.out.println("The year is a leap year: " + leapYear);

        scanner.close();
    }
}
