package com.genaral.pascaltrangle;

public class PascalTraingle {

	/**
	 * Return the value of the exact position according to the row and the column.
	 * 
	 * @param row row number.
	 * @param col column number.
	 * @return the value of the exact position of the Pascal triangle.
	 */
	public static int valueInTrangle(int row, int col) {

		if (col > row) {
			throw new RuntimeException("Error Index");
		} else if (row <= 1 || row == col || col < 1) {
			return 1;
		} else {
			return valueInTrangle(row - 1, col - 1) + valueInTrangle(row - 1, col);
		}

	}
}
