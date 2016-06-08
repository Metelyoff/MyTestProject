package solutions;

public class TestClass {

	public static void main(String[] args) {
		int[] arr = { 5, 8, 4, 0, 1, 2, 6, 7, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tempMemory = arr[i];
					arr[i] = arr[j];
					arr[j] = tempMemory;
				}
			}
			System.out.println(arr[i]);
		}
	}
}