package edu.sjsu.assignment1;

/**
 * Matrix class
 * 
 * @author Yiwen Zhang
 * @since 2022-09-05
 */

public class Matrix{
	private static int row;//rows
	private static int column;//columns
	private int[][] matrix;

	/**
	 * A constructor of the class Matrix.
	 * 
	 * @param array array is a int 2-d array.
	 */
	public Matrix(int[][] array){
		row = array.length;
		column = array[0].length;
		this.matrix = new int[row][column];
		for(int i=0; i < row; i++) {
			for(int j=0; j < column; j++){
				this.matrix[i][j] = array[i][j];
			}
		}
	}

	/**
	 * A method to get the int 2-d array of the matrix.
	 * 
	 * @return the array of the matrix.
	 */
	public int[][] getMatrix(){
		return matrix;
	}

	/**
	 * Amethod to multiply two matrix.
	 * 
	 * @param matrix2 matrix2 is the second multiplier.
	 * @return A new Matrix that takes the products of the two matrix.  
	 */
	public Matrix multiply(Matrix matrix2){
		Matrix matrix1 = this;
		int[][] newArray = new int[row][matrix2.column]; 
		Matrix result = new Matrix(newArray) ;
		for(int i=0;i<result.row;i++){
			for(int j=0; j<result.column;j++){
				for(int k = 0; k < matrix1.column; k++){
					result.matrix[i][j] = result.matrix[i][j] + (matrix1.matrix[i][k] 
						* matrix2.matrix[k][j]);
				}
			}
		}
		return result;
	}
}
