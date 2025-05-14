import java.util.Scanner;

public class cclark_task18
{
    public static void convertTime(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(totalMinutes + " minutes = " + hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int minutes = scanner.nextInt();

        convertTime(minutes);

        scanner.close();
    }
}