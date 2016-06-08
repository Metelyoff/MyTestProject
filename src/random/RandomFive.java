package random;

import java.util.HashSet;
import java.util.Random;

public class RandomFive {
	private final HashSet<Integer> input = new HashSet<Integer>();
	private final Random rnd;
	private final int Count;
	private int genCount = 0;

	public RandomFive(int in) {
		Count = in;
		rnd = new Random(in);
	}

	public int generate() {
		if (genCount >= Count)
			return -1;
		int next;
		do {
			next = rnd.nextInt(Count);
		} while (!input.add(next));

		return next;
	}
}
