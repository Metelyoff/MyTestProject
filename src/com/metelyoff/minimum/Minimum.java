package com.metelyoff.minimum;

public class Minimum {

	    public static int min (int a, int b)
	    {
	        int m;
	        if (a<b)
	            m = a;
	        else 
	            m = b;
	        return m;
	    }
	    
	    public static void main(String[] args)
	    {
	        int c = 6, d = 4;
	        int minimum = min(c, d);
	        System.out.println("Minimum is " + minimum);
	    }
}
