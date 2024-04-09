import java.util.Scanner;

public class Task5 {
    public static void reversedSequence(Scanner scanner, int n) {
        if (n > 0) { //
            int num = scanner.nextInt();
            reversedSequence(scanner, n - 1);
            System.out.print(num + " ");
        }
    }
}

