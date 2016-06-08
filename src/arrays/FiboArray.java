package arrays;

public class FiboArray {
	private int enterNumber;
	private int[] elements;

	public FiboArray() {
	}

	public int calcFibo(int enterNumber) {
		for (int j = 0; j < enterNumber; j++) {
			int a, b, c;
			a = 1;
			b = 1;
			c = a + b;
			a = b;
			b = c;

		}
		return enterNumber;
	}

	public static void main(String[] args) {
		FiboArray fa = new FiboArray();
		fa.calcFibo(20);
	}

	public int getNumber() {
		return enterNumber;
	}

	public void setNumber(int enterNumber) {
		this.enterNumber = enterNumber;
	}

	public int[] getElements() {
		return elements;
	}

	public void setElements(int[] elements) {
		this.elements = elements;
	}
}