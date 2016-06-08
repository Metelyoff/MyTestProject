package solutions;

public class DeleteTheItemFromArray {

	public boolean searchNumber(int[] array, int searchNumber) {
		boolean found = false;
		for (int item : array) {
			if (item == searchNumber) {
				found = true;
				break;
			} else {
				found = false;
			}
		}
		return found;
	}

	public int[] removeItemFromArray(int[] array, int searchNumber) {
		int arraySize = array.length;
		boolean isFound = searchNumber(array, searchNumber);
		for (int indexOfArray = 0; indexOfArray < arraySize; indexOfArray++) {
			System.err.print(array[indexOfArray] + " ");
			if (isFound) {
				// do something
			} else {
				System.err.println("Not found!");
				return array;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		DeleteTheItemFromArray array = new DeleteTheItemFromArray();
		int[] arrayOfNumbers = { 1, 2, 3, 4, 5, 6, 7 };
		int deleteNumber = 4;
		System.out.println(array.searchNumber(arrayOfNumbers, deleteNumber));
		System.out.println("Array before removing item:");
		for (int items : arrayOfNumbers) {
			System.out.print(items + " ");
		}
		System.out.println("\nArray after removing item:");
		for (int items : array.removeItemFromArray(arrayOfNumbers, deleteNumber)) {
			System.out.print(items + " ");
		}
	}
}
