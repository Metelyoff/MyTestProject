package com.metelyoff.random;

import java.util.Random;

public class RandomArray {
	Random r=new Random();
	public int randomRinge(int ringe){
		int[] randomarr = new int [ringe];
		for (int j=0;j<randomarr.length;j++){
			randomarr[j]=r.nextInt(9999);
			System.out.print( "[" + randomarr[j] + "]" );
			}
		return ringe;
	}

	public static void main(String[] args) {
		RandomArray ra=new RandomArray();
		ra.randomRinge(1);
	}
}
