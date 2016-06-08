package random;

import java.util.ArrayList;
import java.util.Random;

class RandomFour {
	private ArrayList<Integer> input = new ArrayList<Integer>();
	Random rnd;
	int Count;
	private boolean check;
	private int genCount = 0;

	public RandomFour(int in) {
		Count = in;
		rnd = new Random(in);

	}

	public int generate() {
		int gen;
		check = true;
		while (check && genCount < Count) {
			gen = rnd.nextInt(Count);
			check = alreadyWas(gen);
			if (!check) {
				input.add(gen);
				genCount++;
				return gen;
			}
		}
		return -1;
	}

	public boolean alreadyWas(int k) {
		for (int i = 0; i < input.size(); i++) {

			if ((Integer) input.get(i) == k)
				return true;
		}
		return false;
	}
}
