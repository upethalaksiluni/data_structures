import java.util.Scanner;

public class cclark_task14
{
    public static double discountPrice(double price, double discount)
    {
        return price - (price * discount / 100);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double finalPrice = discountPrice(price, discountPercentage);
        System.out.printf("Original Price: %.2f%n", price);
        System.out.printf("Discount Percentage: %.2f%%%n", discountPercentage);
        System.out.printf("Final Price: %.2f%n", finalPrice);

        scanner.close();
    }
}
