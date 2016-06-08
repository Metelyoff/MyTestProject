package com.metelyoff.arrays;

public class TestRandomArray{
    
	public int[] enteringArray(int[] enterIntArray){
	    for(int j=0;j<enterIntArray.length;j++){
	    	enterIntArray[j]= (int) Math.floor(Math.random()*enterIntArray.length);
	    	System.out.print(" "+enterIntArray[j]+" "); 
	    	}
	    return null;
	}
	public static void main(String[] args){
		TestRandomArray tra= new TestRandomArray();
	    int[] intArray=new int[10];
	    for(int i=0;i<intArray.length;i++){
	        int result=intArray[i];
	        System.out.print(" "+result+" ");
	        }    
	    System.out.println(" ");
	    tra.enteringArray(intArray);
	    }
}