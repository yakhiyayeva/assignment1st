import java.util.Scanner;
public class Task6 {
    public static void reverseStrings(Scanner scanner, int n) {
        if (n > 0) {
            char[] stringArray = new char[20];
            int i = 0;
            char ch;
            if ((ch = scanner.next().charAt(0)) != '\n' && i < 20) {
                stringArray[i++] = ch;
            }
            reverseStrings(scanner, n - 1); // recursive case
            // base case: print the characters in reverse order
            if (i > 0) {
                System.out.print(stringArray[i - 1]);
                stringArray[i - 1] = '\0'; // clear the character after printing
            }
        }
    }

}
