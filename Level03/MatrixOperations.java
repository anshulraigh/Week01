import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix of given rows and columns
    public static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols]; // Initialize the matrix with given dimensions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1; // Fill the matrix with random values (1 to 10)
            }
        }
        return matrix; // Return the generated matrix
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols]; // Initialize the result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j]; // Add corresponding elements
            }
        }
        return result; // Return the result matrix
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols]; // Initialize the result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j]; // Subtract corresponding elements
            }
        }
        return result; // Return the result matrix
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length, cols = b[0].length, common = a[0].length;
        int[][] result = new int[rows][cols]; // Initialize the result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j]; // Multiply and sum corresponding elements
                }
            }
        }
        return result; // Return the result matrix
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows]; // Transpose swaps rows with columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Assign transposed values
            }
        }
        return transpose; // Return the transposed matrix
    }

    // Method to calculate the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]); // Determinant formula for 2x2
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        int determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                          - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                          + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return determinant; // Return the determinant value
    }

    // Method to calculate the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix); // Get determinant
        double[][] inverse = new double[2][2]; // Initialize the inverse matrix
        inverse[0][0] = matrix[1][1] / (double) determinant; // Calculate inverse
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse; // Return the inverse matrix
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t"); // Print each element separated by a tab
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to display a double matrix (for inverse)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value); // Print each element formatted to 2 decimal places
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        int[][] matrixA = createMatrix(2, 2); // Create matrix A (2x2)
        int[][] matrixB = createMatrix(2, 2); // Create matrix B (2x2)

        System.out.println("Matrix A:");
        displayMatrix(matrixA); // Display matrix A
        System.out.println("Matrix B:");
        displayMatrix(matrixB); // Display matrix B

        System.out.println("Addition:");
        displayMatrix(addMatrices(matrixA, matrixB)); // Display addition result

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB)); // Display subtraction result

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA)); // Display transpose of matrix A

        System.out.println("Determinant of Matrix A: " + determinant2x2(matrixA)); // Display determinant of matrix A

        System.out.println("Inverse of Matrix A:");
        displayMatrix(inverse2x2(matrixA)); // Display inverse of matrix A
    }
}
