package solutions;

public class SuperClass {
	public static void main(String[] args) {
		int[] a = { 6, 3, 7, 2, 0, 8, 9, 5 };
		int begin = a.length - 1;
		for (int i = begin; i < a.length; i--) {
			for (int j = begin - 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
			System.out.println(a[i]);
		}
	}
}
