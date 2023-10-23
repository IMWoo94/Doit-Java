package chap02;

import java.util.Arrays;

public class CloneArray {
	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		int[] c = Arrays.copyOf(a, a.length);
		int[] d = new int[5];
		System.arraycopy(a, 0, d, 0, 5);

		b[3] = 0;
		c[3] = 1;
		d[3] = 2;

		System.out.println("=================");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("=================");
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println("=================");
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		System.out.println("=================");
		for (int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
	}
}
