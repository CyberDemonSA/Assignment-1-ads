public class MatrixSpiral {

    public static void printSpiral(int[][] matrix, int num, int row, int col, int n) {
        if (num > n * n) {
            return;
        }

        for (int i = col; i < n; i++) {
            matrix[row][i] = num++;
        }

        for (int i = row + 1; i < n; i++) {
            matrix[i][n - 1] = num++;
        }

        for (int i = n - 2; i >= col; i--) {
            matrix[n - 1][i] = num++;
        }

        for (int i = n - 2; i > row; i--) {
            matrix[i][col] = num++;
        }

        printSpiral(matrix, num, row + 1, col + 1, n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        printSpiral(matrix, 1, 0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
