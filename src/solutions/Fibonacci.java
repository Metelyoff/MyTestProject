package solutions;

public class Fibonacci {
	public static int CalcFibo(int number) {
		int a = 1, b = 1, c;
		for (int i = 0; i <= number; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
		return number;
	}

	public static void main(String[] args) {
		CalcFibo(20);
	}
}
