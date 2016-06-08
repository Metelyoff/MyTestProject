package random;

import java.util.Random;

public class TestRandom {

	public int getRandom(int range) {
		for (int i = 0; i < range; i++) {
			Random random = new Random();
			System.out.print(random.nextInt(range) + " ");
		}
		return range;
	}

	public static void main(String[] args) {
		TestRandom tr = new TestRandom();
		tr.getRandom(10);
	}
}