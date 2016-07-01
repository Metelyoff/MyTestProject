package solutions;

public class Main {
	public static void main(String[] args) {
		new C();
	}
}

class A {

	public void m2() {
		// TODO: Implement this method
	}

	public void m1() {
		// TODO: Implement this method
	}
	{
		System.out.println("block A");
	}
	static {
		System.out.println("static block A");
	}

	public A() {
		System.out.println("constructor A");
	}
}

class B extends A {
	{
		System.out.println("block B");
	}
	static {
		System.out.println("static block B");
	}

	public B() {
		System.out.println("constructor B");
	}
}

class C extends B {

	{
		System.out.println("block C");
	}
	static {
		System.out.println("static block C");
	}

	public C() {
		System.out.println("constructor C");
	}
}
