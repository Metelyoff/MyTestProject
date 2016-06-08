package random;

public class RandomThere {

	public static void main(String[] args) {
		RandomFour four = new RandomFour(10);
		RandomFive five = new RandomFive(10);
		int[] k = new int[10];
		for (int i = 0; i < k.length; i++) {
			k[i] = five.generate();
			System.out.print(k[i] + " ");
		}
		System.out.println("\n" + "-------------------");
		int[] m = new int[10];
		for (int j = 0; j < m.length; j++) {
			m[j] = four.generate();
			System.out.print(m[j] + " ");
		}
	}
}
