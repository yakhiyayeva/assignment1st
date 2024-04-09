public class Task9 {
    public static void Permutations(char[] str, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(str);
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(str, startIndex, i);
                Permutations(str, startIndex + 1, endIndex);
                swap(str, startIndex, i);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
