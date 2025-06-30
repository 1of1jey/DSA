import java.util.Scanner;

public class Main
 {
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in); {

           //Binary
           System.out.print("Enter a number to count its binary digits: ");
           int number = scanner.nextInt();
           String Binary = Integer.toBinaryString(number);
           System.out.println("Binary number is: " + Binary);
           System.out.println("Number of binary digits: " + Binary.length());
       
        //Sequential
         System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the number to search for: ");
            int key = scanner.nextInt();
            int result = Sequential.sequential(arr, key);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array. Returned :-1");
            }

              //MaxValue
            System.out.print("Enter the size of the array to find the maximum value: ");
            int maxValueSize = scanner.nextInt();
            int array[] = new int[maxValueSize];
            System.out.print("Enter the element of the array: ");
            for (int i = 0; i < maxValueSize; i++) {
                array[i] = scanner.nextInt();
            }
            int maxValue = MaxValue.maxValue(array);
            System.out.println("Max value in the array: " + maxValue);

            //Matrix Multiplication
            System.out.print("Enter the number of rows and columns for Matrix A: ");
            int rowsA = scanner.nextInt();
            int colsA = scanner.nextInt();
            double[][] A = new double[rowsA][colsA];
            System.out.println("Enter the elements of Matrix A:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    A[i][j] = scanner.nextDouble();
                }
            }
            System.out.print("Enter the number of rows and columns for Matrix B: ");
            int rowsB = scanner.nextInt();
            int colsB = scanner.nextInt();
            double[][] matrixB = new double[rowsB][colsB];
            System.out.println("Enter the elements of Matrix B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                    matrixB[i][j] = scanner.nextDouble();
                }
            }

             if (rowsB != colsA) {
                System.out.println("Invalid number of rows for Matrix B. It should match number of columns of A");
            
                return;
            }
            
            try{
                double[][] C = MatrixMultiplication.multiply(A, matrixB);
                System.out.println("\nResult of Matrix Multiplication:");
                MatrixMultiplication.printMatrix(C);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            //Factorial
            System.out.print("Enter a non-negative number to calculate its factorial: ");
            int factorialN = scanner.nextInt();
            if (factorialN < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int resultFactorial = Factorial.factorial(factorialN);
                System.out.println("Factorial of " + factorialN + " is: " + resultFactorial);
            }

            //Unique 
            //Get array input from user 
            System.out.print("Enter the number of element for uniqueness check: ");
            int uniqueSize = scanner.nextInt();
            int[]uniqueArray = new int[uniqueSize];
            
            System.out.println("Enter " + uniqueSize + "integer elements:");
            for (int i = 0; i < size; i ++){
                array[i] = scanner.nextInt();
            }
            boolean isUnique = Unique.unique(array);
            System.out.println("All elements are unique: " + isUnique);
            
            if (isUnique){
                System.out.print("Unique elements: ");
                for (int val : array){
                    System.out.print(val + " ");
                }
                System.out.println();
            }

           //GaussElimination
        // Input number of variables (matrix size)
        System.out.print("Enter number of variables (e.g. 3 for a 3x4 augmented matrix): ");
        int n = scanner.nextInt();

        double[][] augmentedB = new double[n][n + 1]; // Augmented matrix has n+1 columns

        // Input augmented matrix
        System.out.println("Enter the augmented matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                augmentedB[i][j] = scanner.nextDouble();
            }
        }

        // Perform Gaussian Elimination
        GaussElimination.gaussian(augmentedB, n);
        //Display result
        System.out.println("\nMatrix after Gauss Elimination (Row Echelon Form):");
        MatrixMultiplication.printMatrix(augmentedB);
       }

   }

}


