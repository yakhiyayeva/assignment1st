public class Task8 {
    public static void generatingSequences(int n, int k, String sequence) {
        // base
        if (n == 0) {
            System.out.println(sequence);
            return;
        }

        // recursive case
        for (int i = 1; i <= k; i++) {
            generatingSequences(n - 1, k, sequence + i + " ");
        }
    }
}
