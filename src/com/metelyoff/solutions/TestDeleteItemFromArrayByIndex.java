package com.metelyoff.solutions;

public class TestDeleteItemFromArrayByIndex
{
	public static int[] removeItemByIndex(int[] array,int index){
		int[] newArray=new int[array.length-1];
		for(int i=0;i<newArray.length;i++){
			if(i>=index){
				newArray[i]=array[i+1];
			}else{
				newArray[i]=array[i];
			}
		}
		return newArray;
	}
	
	public static void main(String[] args){
		int[] testArray={5,4,8,2,1,0,9};
		testArray=removeItemByIndex(testArray,4);
		for(int elements:testArray){
			System.out.print(elements+" ");
		}
	}
}