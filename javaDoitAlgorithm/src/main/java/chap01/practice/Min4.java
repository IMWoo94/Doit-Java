package chap01.practice;

public class Min4 {

	static int min3(int a, int b, int c, int d) {
		int min = a;

		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;

		return min;
	}

	public static void main(String[] args) {
		System.out.println("min3(1, 0, -3, 5) = " + min3(1, 0, -3, 5));
	}
}
