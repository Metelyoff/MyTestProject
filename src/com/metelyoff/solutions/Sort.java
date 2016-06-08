package com.metelyoff.solutions;

import com.metelyoff.arrays.TestRandomArray;

public class Sort {
	public static void main(String[] args) {
		TestRandomArray tra=new TestRandomArray();
		int[] a=new int[10];
		System.out.println(tra.enteringArray(a));
		System.out.println("  ");
		
		for (int i=a.length-1;i>=2;i--){
			
			boolean sorted=true;
			
			for (int j=0;j<i;j++){
				if(a[j]<a[j+1]){
					int tempMemory=a[j];
					a[j]=a[j+1];
					a[j+1]=tempMemory;
					sorted=false;
				}
			}
			if(sorted){
				break;
			}
			System.out.print(a[i]+" ");
		}
		
	}
}
