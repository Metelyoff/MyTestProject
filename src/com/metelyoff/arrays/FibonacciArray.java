package com.metelyoff.arrays;

public class FibonacciArray {

	public int calcFibonacci(int number){
		int [] fibo=new int[number];
		int a,b,c;
		a=1;
		b=1;
		for(int i=0;i<fibo.length;i++){
			for (int j=0;j<number;j++){
				c=a+b;
				a=b;
				b=c;
				fibo[i]=c;
				System.out.print(i+" ");}
		}
		return number;
	}
	
	public static void main(String[] args) {
		FibonacciArray fa = new FibonacciArray();
		fa.calcFibonacci(5);
	}
}
