package solutions;

public class Sorting {

	public int[] sorting(int[] random, boolean ascendingly) {

		if (ascendingly == true) {
			System.out.println("Sorting ascendingly:");
			for (int i = 0; i < random.length; i++) {
				for (int j = i + 1; j < random.length; j++) {
					if (random[i] > random[j]) {
						int tempMemory = random[i];
						random[i] = random[j];
						random[j] = tempMemory;
					}
				}
				System.out.print(random[i] + " ");
			}
		} else {
			System.out.println("Sorting descendingly:");
			for (int i = random.length - 1; i >= 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (random[i] < random[j]) {
						int tempMemory = random[i];
						random[i] = random[j];
						random[j] = tempMemory;
					}
				}
				System.out.print(random[i] + " ");
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Sorting s = new Sorting();
		int[] enterNumbers = { 6, 8, 7, 4, 2, 3, 1, 0, 8, 94, 15 };
		s.sorting(enterNumbers, false);
	}
}
