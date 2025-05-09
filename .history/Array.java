public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
    public int[][] getRowMajorSquare(int x) {
        int[][] matrix = new int[x][x];
        int value = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
    public int[][] getColumnMajorSquare(int x) {
        int[][] matrix = new int[x][x];
        int value = 1;
        for (int j = 0; j < x; j++) {
            for (int i = 0; i < x; i++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
	// Array should be of format
	// 1 2 3 4
	// 5 6 7 8
	// 9 10 11 12
    public int[][] getRowMajorRectangle(int row, int column) {
        int[][] matrix = new int[row][column];
        int value = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
    public int[][] getColumnMajorRectangle(int column, int row) {
        int[][] matrix = new int[row][column];
        int value = 1;
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
    public void printDouble(int[][] a) {
        for (int[] row : a) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }
}