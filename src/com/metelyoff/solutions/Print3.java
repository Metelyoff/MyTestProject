package com.metelyoff.solutions;

import java.util.Scanner;

public class Print3 {

	public static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter the word:");
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i=0;i<3;i++){
			System.out.print(s+" ");
		}
	}

}
