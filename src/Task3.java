public class Task3 {
    public static int sumOfFirstNInts(int n) {
    // base case
    if (n == 0) {
        return 0;
    }
    // recursive case
    else {
        return n + sumOfFirstNInts(n - 1);
    }
}
}
