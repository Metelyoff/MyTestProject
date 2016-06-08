package com.metelyoff.solutions;

public class ArrayOfIntegersApp
{
	public static void main(String[] args){
		int[] testArray={5,4,8,2,1,0,9};
		ArrayOfIntegers array=new ArrayOfIntegers(testArray);
		System.out.println("Current array:");
		array.displayItems();
		array.insertValueByIndex(0,3);
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Array after insert value:");
		array.displayItems();
		System.out.println();
		System.out.println("---------------------");
		System.out.print(array.toString());
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		System.out.println("Array after remove value:");
		array.deleteByValue(9);
		array.insertValueByIndex(5,99);
		array.deleteByValue(2);
		System.out.println();
		array.displayItems();
		array.deleteByValue(5);
		System.out.println();
		array.displayItems();
		array.deleteByValue(3);
		System.out.println();
		array.displayItems();
		System.out.println();
		array.deleteByValue(4);
		array.deleteByValue(99);
		array.deleteByValue(8);
		array.deleteByValue(0);
		array.deleteByValue(1);
		//array.deleteByValue(9);
		array.displayItems();
		System.out.println();
		System.out.println("---------------------");
		System.out.println(array.toString());
		System.out.println("---------------------");
	}
}
