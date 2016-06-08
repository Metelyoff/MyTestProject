package solutions;

public class Summa {

	public int sum(int a, int b) {
		int x;
		x = a + b;
		return x;
	}

	public double sum(double a, double b) {
		double x;
		x = a + b;
		return x;
	}

	public static void main(String[] args) {
		Summa s = new Summa();
		System.out.print(s.sum(5, 5.5));
	}

}