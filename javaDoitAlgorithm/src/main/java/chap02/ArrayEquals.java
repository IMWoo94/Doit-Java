package chap02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayEquals {

	static boolean equals(int[] a, int[] b) {

		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("a 요솟수 : ");
		int num = in.nextInt();

		System.out.println("a 값 입력");
		int[] a = new int[num];
		a = Arrays.stream(a).map(o -> in.nextInt()).toArray();

		System.out.println("b 요솟수 : ");
		int num1 = in.nextInt();

		System.out.println("b 값 입력");
		int[] b = new int[num1];
		b = Arrays.stream(b).map(o -> in.nextInt()).toArray();

		System.out.println("배열 a 와 b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
		System.out.println(Arrays.equals(a, b));

		copy(a, b);
		rcopy(a, b);
	}

	static void copy(int[] a, int[] b) {
		// a = b.clone();
		// a = Arrays.stream(b).toArray();
		a = Arrays.copyOf(b, b.length);

		for (int i : a) {
			System.out.println("i = " + i);
		}
	}

	static void rcopy(int[] a, int[] b) {
		Integer[] temp = Arrays.stream(b).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		a = Arrays.stream(temp).mapToInt(o -> o).toArray();
		for (int i : a) {
			System.out.println("i = " + i);
		}
	}
}
