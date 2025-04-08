import java.util.Scanner;

public class MatrixOperations {
    
    // Method to perform matrix addition
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }
    
    // Method to perform matrix multiplication
    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][0] * mat2[0][j] + mat1[i][1] * mat2[1][j];
            }
        }
        return result;
    }
    
    // Method to find matrix transpose
    public static int[][] transposeMatrix(int[][] mat) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat[j][i];
            }
        }
        return result;
    }
    
    // Method to display a matrix
    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];
        
        // Taking input for first matrix
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }
        
        // Taking input for second matrix
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat2[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Choose operation:\n1. Addition\n2. Multiplication\n3. Transpose of first matrix");
        int choice = scanner.nextInt();
        scanner.close();
        
        switch (choice) {
            case 1:
                System.out.println("Result of Addition:");
                displayMatrix(addMatrices(mat1, mat2));
                break;
            case 2:
                System.out.println("Result of Multiplication:");
                displayMatrix(multiplyMatrices(mat1, mat2));
                break;
            case 3:
                System.out.println("Transpose of First Matrix:");
                displayMatrix(transposeMatrix(mat1));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
