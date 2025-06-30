public class MatrixMultiplication {
    public static double [][] multiply(double[][] A, double[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix A's columns must match Matrix B's rows.");
        }

        double[][] C = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
            C[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + "");
            }
            System.out.println();
        }
    }
}
/*
 Best Case:
Even in the best case (e.g., many zeros), the nested loops still iterate fully.
Time Complexity: O(m × n × p)

Worst Case:
Every entry of both A and B is non-zero and must be multiplied and added.
Time Complexity: O(m × n × p)

Average Case:
Same as best and worst — all elements processed.
Time Complexity: O(m × n × p)

Pseudocode
FUNCTION multiply(A, B):
    rowsA ← number of rows in A
    colsA ← number of columns in A
    rowsB ← number of rows in B
    colsB ← number of columns in B

    IF colsA ≠ rowsB:
        THROW "Matrix A's columns must match Matrix B's rows"

    CREATE C as matrix of size rowsA × colsB

    FOR i FROM 0 TO rowsA - 1:
        FOR j FROM 0 TO colsB - 1:
            C[i][j] ← 0
            FOR k FROM 0 TO colsA - 1:
                C[i][j] ← C[i][j] + (A[i][k] * B[k][j])

    RETURN C
END FUNCTION

 */
