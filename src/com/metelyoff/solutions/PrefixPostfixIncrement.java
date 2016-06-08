package com.metelyoff.solutions;

public class PrefixPostfixIncrement
{
	public static void main(String args[]){
		int x,i,a=6,b=7;
		x=a++ + b++;
		i=a+b;
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("i="+i);
	}
}
