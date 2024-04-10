import java.util.Scanner;

public class MatrixSpiral {

    public static void fillSpiral(int[][] matrix, int n, int num, int row, int col, String direction) {
        if (num > n * n) {return;}

        matrix[row][col] = num;

        switch (direction) {
            case "right":
                if (col + 1 < n && matrix[row][col + 1] == 0) {
                    fillSpiral(matrix, n, num + 1, row, col + 1, "right");
                } else {
                    fillSpiral(matrix, n, num + 1, row + 1, col, "down");
                }
                break;
            case "down":
                if (row + 1 < n && matrix[row + 1][col] == 0) {
                    fillSpiral(matrix, n, num + 1, row + 1, col, "down");
                } else {
                    fillSpiral(matrix, n, num + 1, row, col - 1, "left");
                }
                break;
            case "left":
                if (col - 1 >= 0 && matrix[row][col - 1] == 0) {
                    fillSpiral(matrix, n, num + 1, row, col - 1, "left");
                } else {
                    fillSpiral(matrix, n, num + 1, row - 1, col, "up");
                }
                break;
            case "up":
                if (row - 1 >= 0 && matrix[row - 1][col] == 0) {
                    fillSpiral(matrix, n, num + 1, row - 1, col, "up");
                } else {
                    fillSpiral(matrix, n, num + 1, row, col + 1, "right");
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        fillSpiral(matrix, n, 1, 0, 0, "right");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");}
            System.out.println();}
    }
}
