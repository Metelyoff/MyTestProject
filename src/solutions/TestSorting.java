package solutions;

import arrays.TestRandomArray;

public class TestSorting {

	public static void main(String[] args) {
		TestRandomArray tra = new TestRandomArray();
		int[] a = new int[10];
		System.out.println(tra.enteringArray(a));
		System.out.println("  ");

		for (int i = 0; i < a.length; i++) {

			int min = a[i];
			int imin = i;

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < min) {
					min = a[j];
					imin = j;
				}
			}
			if (i != imin) {
				int temp = a[i];
				a[i] = a[imin];
				a[imin] = temp;
			}
			System.out.print(a[i] + " ");
		}
	}
}
