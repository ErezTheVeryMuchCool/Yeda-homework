public class P34E28 {

    public static boolean allGreater(int[][] mat, int num) {
        return checkMatrix(mat, num, 0, 0);
    }

    // פעולה רקורסיבית עוזרת
    private static boolean checkMatrix(int[][] mat, int num, int row, int col) {
        if (row == mat.length)
            return true;

        if (col == mat[row].length)
            return checkMatrix(mat, num, row + 1, 0);

        if (mat[row][col] <= num)
            return false;

        return checkMatrix(mat, num, row, col + 1);
    }
}
