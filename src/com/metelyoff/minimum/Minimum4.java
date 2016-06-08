package com.metelyoff.minimum;

public class Minimum4 {
	public static int min(int a, int b, int c,int d)
    {
        int m4;
        int m1;
        int m2;
        if (a<b)
        m1=a;
        else m1=b;
        if (c<d)
        m2=c;
        else m2=d;
        if (m1<m2)
        m4=m1;
        else m4=m2;
        return m4;
        }

	public static void main(String[] args) {
		int number1=1,
			number2=2,
			number3=3,
			number4=4;
		int m = min(number1,number2,number3,number4);
		System.out.println(m);
		}
}
