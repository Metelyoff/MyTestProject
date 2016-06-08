package com.metelyoff.arrays;

public class ArrayTest {

	public int[] testArr(int number){
		int[] testArrayTest=new int[number];
		for (int i=0;i<testArrayTest.length;i++){
		System.out.println(testArrayTest[i]);}
		return testArrayTest;
	}
	
	public static void main(String[] args) {
		ArrayTest at=new ArrayTest();
		at.testArr(10);

	}

}
