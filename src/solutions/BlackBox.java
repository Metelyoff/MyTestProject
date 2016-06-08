package solutions;

class BlackBox {
	int a;
	int b;

	BlackBox(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlackBox bb = (BlackBox) obj;
		if (a != bb.a)
			return false;
		if (b != bb.b)
			return false;
		return true;
	}
}
