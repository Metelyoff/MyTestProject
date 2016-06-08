package com.metelyoff.arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] da = new int[6][4];
		for(int i=0; i<da.length; i++) {
		  for(int j=0; j<da[i].length; j++) {
		    da[i][j] = (int)(Math.random()*10);
		  }
		}
		for(int i=0; i<da.length; i++) {
		  for(int j=0; j<da[i].length; j++) {
		    System.out.print(da[i][j] + "\t");
		  }
		  System.out.println(); // Переходим на следующую строку
		}		
	}
}
