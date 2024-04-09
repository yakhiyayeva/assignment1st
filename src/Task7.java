public class Task7 {
    public static void fillSpiral(int[][] square, int num, int row, int col, int direction, int n) {
        // base case
        if (num == n * n) {
            square[row][col] = num;
            return;
        }

        square[row][col] = num;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // Try the next cell in the current direction
        int newRow = row + directions[direction][0];
        int newCol = col + directions[direction][1];

        if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= n || square[newRow][newCol] != 0) {
            direction = (direction + 1) % 4;
            newRow = row + directions[direction][0];
            newCol = col + directions[direction][1];
        }

        // Recursively fill the next cell
        fillSpiral(square, num + 1, newRow, newCol, direction, n);
    }

    public static void printSquare(int[][] square, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
