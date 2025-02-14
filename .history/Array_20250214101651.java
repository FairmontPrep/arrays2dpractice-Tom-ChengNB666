public class Array {

    // Returns a square matrix in row-major order
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

    // Returns a square matrix in column-major order
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

    // Returns a rectangular matrix in row-major order
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

    // Returns a rectangular matrix in column-major order
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

    // Prints a matrix with two spaces per digit
    public void printDouble(int[][] a) {
        for (int[] row : a) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Array array = new Array();

        System.out.println("Row-Major Square (3x3):");
        array.printDouble(array.getRowMajorSquare(3));

        System.out.println("\nColumn-Major Square (3x3):");
        array.printDouble(array.getColumnMajorSquare(3));

        System.out.println("\nRow-Major Rectangle (3x4):");
        array.printDouble(array.getRowMajorRectangle(3, 4));

        System.out.println("\nColumn-Major Rectangle (3x4):");
        array.printDouble(array.getColumnMajorRectangle(4, 3));
    }
}
