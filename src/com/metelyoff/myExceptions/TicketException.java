package com.metelyoff.myExceptions;

public class TicketException extends Exception{
	
	private int number;

	public TicketException(int n) {
		number=n;
	}

	public String toString(){
		String s="TicketException number of ["+number+"]";
		return s;
	}
}
