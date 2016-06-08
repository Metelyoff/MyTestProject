package arrays;

public class IntegerFillToArray {

	public int[] intArray(int rangeNumber) {
		int[] resultateArray = new int[rangeNumber];
		for (int i = 1; i < resultateArray.length; i++) {
			System.out.println(resultateArray[i] = i);
		}
		return resultateArray;
	}

	public static void main(String[] args) {
		IntegerFillToArray ifta = new IntegerFillToArray();
		ifta.intArray(11);
	}

}