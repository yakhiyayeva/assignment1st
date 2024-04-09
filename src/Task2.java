public class Task2 {
    public static int sumOfFirstNElements(int[] array, int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
        else {
            return array[n - 1] + sumOfFirstNElements(array, n - 1);
        }
    }
}
