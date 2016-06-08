package com.metelyoff.arrays;

/*
 *public class RandomArray {

 public int[] integerArray(int[] array){

  return null;
 }
 
 public static void main(String[] args) {
  RandomArray ranarr=new RandomArray();
  int[] testArray = new int[10];
  ranarr.integerArray(testArray);
    }
 }
 * */


public class RandomArray {

	public int[] integerArray(int intNumber){
		int[] intNumArr=new int [intNumber];
		int[] randomArr=intNumArr;
		for(int j=0;j<randomArr.length;j++){
			int randomNambers=(int)Math.floor(Math.random()*intNumber);			
			System.out.print(" "+randomNambers +" ");
		}
		return randomArr;
	}
	
	public static void main(String[] args) {
		RandomArray ranarr=new RandomArray();
		ranarr.integerArray(100);
		  }
	}

