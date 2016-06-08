package random;

public class FifteenInit {
	public FifteenInit() {
	}

	static int random(int max) {
		return (int) Math.round(Math.random() * max);
	}

	static int random(int min, int max) {
		return ((int) min + random((int) max - (int) min));
	}

	static void shift_array(int[] b, int start, int arlen) {
		int i;
		for (i = start + 1; i <= arlen - 1; ++i)
			b[i - 1] = b[i];
		b[arlen - 1] = -1;
	}

	public void initArray(int[][] a) {
		int[] b = new int[16];
		int blen = 16;
		int k, i, j, n = 0;
		for (i = 0; i < 16; ++i)
			b[i] = i;
		i = 0;
		j = 1;
		for (k = 1; k < 16; ++k) {
			n = random(1, blen - 1);
			a[i][j] = b[n];
			shift_array(b, n, blen);
			--blen;
			++j;
			if (j % 4 == 0) {
				j = 0;
				++i;
			}
		}
	}
}
