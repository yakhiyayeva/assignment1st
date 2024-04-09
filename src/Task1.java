import java.util.Scanner;

public class Task1 {
    public static int calculateSum(int n) {
        if (n == 1) { //base case
            return 1;
        } else {
            return (int) Math.pow(n, 2) + calculateSum(n - 1); //recursive case
        }
    }
}