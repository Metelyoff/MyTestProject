package com.metelyoff.solutions;
import java.util.*;

public class TestArrayGenerator
{
	public static int[] generateArray(int lengthOfArray){
		Random random=new Random();
		int[] generatedArray=new int[lengthOfArray];
		for(int i=0;i<lengthOfArray;i++){
			generatedArray[i]=random.nextInt(lengthOfArray);
		}
		return generatedArray;
	}
	
	public static void main(String[] args){
		try{
			for(int nums:generateArray(45)){
				System.out.print(nums+" ");
			}
		}catch(NegativeArraySizeException e){
			System.err.println("The length can not be negative "+e);
		}catch(IndexOutOfBoundsException e){
			System.err.println(e);
		}catch(OutOfMemoryError e){
			System.err.println("Value must be in range from 0 to 999999999\n"+e);
		}
	}
}
