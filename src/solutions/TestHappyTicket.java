package solutions;

import java.util.Random;

public class TestHappyTicket {

	public static void main(String[] args) {
		Random r = new Random();
		int n1 = (int) Math.round(Math.random() * 10);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) Math.round(Math.random() * 10);
			System.out.println(i);
		}
	}

}
