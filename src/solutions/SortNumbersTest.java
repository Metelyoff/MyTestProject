package solutions;

public class SortNumbersTest {
	public static void main(String[] args) {
		int[] a = { 5, 4, 2, 6 };
		for (int i = a.length - 1; i >= 2; i--) {
			int randomNum = a[i];
			System.out.println(randomNum);
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				System.out.println(j);
				if (a[j] < a[j + 1]) {

				}
			}
		}
	}

}