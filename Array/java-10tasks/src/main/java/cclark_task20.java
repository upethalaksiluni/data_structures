import java.util.Scanner;

public class cclark_task20
{
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        boolean vowel = isVowel(character);
        System.out.println("'" + character + "' is " + (vowel ? "a vowel" : "not a vowel"));

        scanner.close();
    }
}

