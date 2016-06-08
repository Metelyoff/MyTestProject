package solutions;

class DemoBlackBox {
	public static void main(String args[]) {
		BlackBox bb1 = new BlackBox(5, 10);
		BlackBox bb2 = new BlackBox(5, 11);
		BlackBox bb3 = bb2;

		System.out.println(bb1.equals(bb2));
		System.out.println(bb2.equals(bb3));
		System.out.println(bb1.hashCode() == bb2.hashCode());
	}
}
