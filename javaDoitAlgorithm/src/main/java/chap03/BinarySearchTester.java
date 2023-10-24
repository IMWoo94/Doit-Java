package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("요소수 : ");
		int num = in.nextInt();
		int[] x = new int[num];

		System.out.println("오름 차순으로 입력하세요.");

		System.out.println("첫 요소 입력 x[0]");
		x[0] = in.nextInt();
		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = in.nextInt();
			} while (x[i - 1] > x[i]);
		}

		System.out.println("검색할 값");
		int ky = in.nextInt();

		int idx = Arrays.binarySearch(x, ky);

		if (idx < 0) {
			System.out.println("그 값의 요소가 없습니다 : " + idx);
		} else {
			System.out.println(ky + " 은 x[" + idx + "]에 있습니다.");
		}
	}
}
