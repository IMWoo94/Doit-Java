package chap02;

public class ArraySumForIn {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

		for (double v : a) {
			System.out.println(v);
		}

		double sum = 0;

		for (double v : a) {
			sum += v;
		}

		System.out.println("sum = " + sum);
	}
}
