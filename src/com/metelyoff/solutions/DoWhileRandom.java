package com.metelyoff.solutions;

import java.util.Random;
import java.util.HashSet;

class DoWhileRandom
{
	Random rnd;
	HashSet<Integer> input=new HashSet<Integer>();
	
	private int generate(int stop)
    {
        int next;
		rnd=new Random(stop);
        do
        {
            next = rnd.nextInt(stop);
        }
        while (!input.add(next));
        return next;
    }
	
	int putInArr(int boundArr){
		int[] arr=new int[boundArr];
		for(int i=0;i<arr.length;i++){
			arr[i]=this.generate(boundArr);
			System.out.println(arr[i]);  
		}
		return boundArr=0;
	}
	
	public static void main(String args[]){
		DoWhileRandom dwr=new DoWhileRandom();
		dwr.putInArr(14);
	}
}
