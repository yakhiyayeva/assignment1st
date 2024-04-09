public class Task10 {
    public static boolean isPowerOfTwo(int n) {
        // base case: if n = 1, it's a power of 2
        if (n == 1)
            return true;
        else if (n % 2 != 0 || n == 0)
            return false;
            //recursive case: continue dividing n by 2
        else
            return isPowerOfTwo(n / 2);
    }

}