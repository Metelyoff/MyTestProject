package com.metelyoff.solutions;

public class TestDeleteItemFromArray
{
	
	public int getIndexOfValue(int[] array,int value){
		int indexOfValue=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==value){
				indexOfValue=i;
				break;
			}
		}
		return indexOfValue;
	}
	
	public int[] removeByIndex(int[] array,int index){
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
		TestDeleteItemFromArray array=new TestDeleteItemFromArray();
		int[] testArray={5,4,8,2,1,0,9};
		System.out.println("Current array:");
		for(int i:testArray){
			System.out.print(i+" ");
		}
		System.out.println();
		int[] newTestArray=array.removeByIndex(testArray,3);
		System.out.println("Array after deleting by index:");
		for(int i:newTestArray){
			System.out.print(i+" ");
		}
		testArray=newTestArray;
		int indexOfValue=array.getIndexOfValue(testArray,9);
		newTestArray=array.removeByIndex(testArray,indexOfValue);
		System.out.println();
		System.out.println("Array after deleting by value");
		for(int i:newTestArray){
			System.out.print(i+" ");
		}
	}
}
