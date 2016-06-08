package com.metelyoff.solutions;
import java.util.*;

public class TestAverageTimeForDeleteElementsFromArray
{
	
	public static int[] removeItemCopyMethod(int[] array, int index) {
		int sizeOfNewArray = array.length - 1;
		int sizeOfOldArray=array.length;
		int[] newArray = new int[sizeOfNewArray];
		int tempIndexOfArray = 0;
		for (int i=0; i < sizeOfOldArray; i++) {
			if (i != index) {
				if (i == sizeOfNewArray){
					return array;
				}else{
					newArray[i] = array[i];
				}
			} else {
				tempIndexOfArray=i;
				break;
			}
		}
		for (int next = tempIndexOfArray; next < sizeOfNewArray; next++){
			newArray[next] = array[next + 1];
			}
		return newArray;
	}
	
	public static int[] removeItemByIndexMoveMethod(int[] array,int index){
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
	
	public static void deleteSomeAmountItemsByCopyMethod(int[] array, int quantity){
		if(quantity>array.length){
			System.err.println("Quantity must be less than size of array");
		}else{
			for(int i=0;i<quantity;i++){
				removeItemCopyMethod(array, i);
			}
		}
	}
	
	public static void deleteSomeAmountItemsByMoveMethod(int[] array, int quantity){
		if(quantity>array.length){
			System.err.println("Quantity must be less than size of array");
		}else{
			for(int i=0;i<quantity;i++){
				removeItemByIndexMoveMethod(array, i);
			}
		}
	}
	
	public static long getAverageTimeOfCopyMethod(int[] array){
		long startTime,endTime,result100,result1000,result10000,totalResult=0;
        Date startDate,endDate;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByCopyMethod(array, 100);
        endDate=new Date();
        endTime=endDate.getTime();
        result100=endTime-startTime;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByCopyMethod(array, 1000);
        endDate=new Date();
        endTime=endDate.getTime();
        result1000=endTime-startTime;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByCopyMethod(array, 100000);
        endDate=new Date();
        endTime=endDate.getTime();
        result10000=endTime-startTime;
        
        return totalResult=(result100+result1000+result10000)/3;
	}
	
	public static long getAverageTimeOfMoveMethod(int[] array){
		long startTime,endTime,result100,result1000,result10000,totalResult=0;
        Date startDate,endDate;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByMoveMethod(array, 100);
        endDate=new Date();
        endTime=endDate.getTime();
        result100=endTime-startTime;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByMoveMethod(array, 1000);
        endDate=new Date();
        endTime=endDate.getTime();
        result1000=endTime-startTime;
        
        startDate=new Date();
        startTime=startDate.getTime();
       	deleteSomeAmountItemsByMoveMethod(array, 100000);
        endDate=new Date();
        endTime=endDate.getTime();
        result10000=endTime-startTime;
        
        return totalResult=(result100+result1000+result10000)/3;
	}
	
	public static void main(String[] args){
		TestArrayGenerator testArray=new TestArrayGenerator();
		int[] array=testArray.generateArray(100000);
		System.out.println("delete item by move method take "+getAverageTimeOfMoveMethod(array)+" miliseconds");
		System.out.println("delete item by copy method take "+getAverageTimeOfCopyMethod(array)+" miliseconds");
	}
}
