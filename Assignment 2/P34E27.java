public class P34E27 {

    public static int countNumber(int[][] matrix, int number) {
        return countHelper(matrix, number, 0, 0);
    }

    private static int countHelper(int[][] matrix, int number, int row, int col) {
        if (row >= matrix.length) {
            return 0;
        }

        if (col >= matrix[row].length) {
            return countHelper(matrix, number, row + 1, 0);
        }

        int count = (matrix[row][col] == number) ? 1 : 0;
        return count + countHelper(matrix, number, row, col + 1);
    }
}
