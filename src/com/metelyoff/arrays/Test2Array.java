package com.metelyoff.arrays;

public class Test2Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][]x = new int[5][];
		for (int j = 0; j < 5; j++)
			x[j] = new int[j];
		System.out.println(x);
		

	}

}
