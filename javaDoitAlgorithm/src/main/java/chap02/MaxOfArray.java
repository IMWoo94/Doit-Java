package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		// int max = a[0];
		// for (int i = 1; i < a.length; i++) {
		// 	if (a[i] > max)
		// 		max = a[i];
		// }

		// return max;

		// a[0] = 9999;
		return Arrays.stream(a).max().orElseGet(() -> 0);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.println(" 사람 수 : ");
		int num = in.nextInt();

		int[] heigth = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("heigth[" + i + "] : ");
			heigth[i] = in.nextInt();
		}

		System.out.println("최댓값은 " + maxOf(heigth) + " 입니다.");

		for (int i : heigth) {
			System.out.println("i = " + i);

		}
	}
}
