package dsa_and_arrays;

public class Matrix {

	
		
	    static void printMatrix(int Mat[][],
	                            int rowSize,
	                            int colmSize)
	    {
	        for (int i = 0; i < rowSize; i++) {
	            for (int j = 0; j < colmSize; j++)
	                System.out.print(Mat[i][j] + " ");
	 
	            System.out.println();
	        }
	    }
	 
	   
	    static void multiplyMatrix(
	        int row1, int colm1, int A[][],
	        int row2, int colm2, int B[][])
	    {
	        int i, j, k;
	 
	       
	        System.out.println("\nMatrix A:");
	        printMatrix(A, row1, colm1);
	        System.out.println("\nMatrix B:");
	        printMatrix(B, row2, colm2);
	 
	
	        if (row2 != colm1) {
	 
	            System.out.println("\nMultiplication Not Possible");
	            return;
	        }
	 
	        int C[][] = new int[row1][colm2];
	 
	        for (i = 0; i < row1; i++) {
	            for (j = 0; j < colm2; j++) {
	                for (k = 0; k < row2; k++)
	                    C[i][j] += A[i][k] * B[k][j];
	            }
	        }
	 
	        System.out.println("\nResultant Matrix:");
	        printMatrix(C, row1, colm2);
	    }
	    public static void main(String[] args)
	    {
	 
	        int row1 = 3, colm1 = 3, row2 = 3, colm2 = 3;
	 
	        int A[][] = { { 1, 1, 1 },
	                      { 2, 1, 2 },
	                      { 3, 3, 1 },
	                    };
	 
	        int B[][] = { { 1, 1, 1 },
	                      { 2, 2, 2 },
	                      { 3, 3, 3 } 
	                    };
	 
	        multiplyMatrix(row1, colm1, A,
	                       row2, colm2, B);
	    }
	}

