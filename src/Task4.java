public class Task4 {
    public static int sumOfFirstNPows(int b, int n) {
        // base case:b^0 = 1
        if (n == 0) {
            return 1;
        }
        //recursive case
        else {
            return (int) Math.pow(b, n) + sumOfFirstNPows(b, n - 1);
        }
    }

}
