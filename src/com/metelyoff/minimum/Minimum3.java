package com.metelyoff.minimum;

public class Minimum3 {
	public static int min(int a, int b, int c)
    {
        int m3;
        if (a<b)
        m3=a;
        else m3=b;
        if (c<m3)
        m3=c;
        return m3;
        }

	public static void main(String[] args) {
		int number1=5,
			number2=8,
			number3=9;
		int m = min(number1,number2,number3);
		System.out.println(m);
		}

}
