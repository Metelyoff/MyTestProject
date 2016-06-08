package solutions;

public class RunnerLogic {
	public double salary(int coeff) throws Throwable {
		double d;
		try {
			if ((d = 10 - 100 / coeff) < 0)
				throw new Throwable("negative salary");
			else
				return d;
		} catch (Throwable e) {
			throw new Throwable("div by zero", e);
		}
	}

	public static void main(String[] args) {
		RunnerLogic r = new RunnerLogic();
		try {
			System.out.println(r.salary(0));
		} catch (Throwable e) {
			System.err.println("WTF?");
		}
	}

}
