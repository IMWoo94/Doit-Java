package chap01;

import java.util.Scanner;

public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("===== 곱셈표 =====");

		for (int i = 1; i <= 9; i++) {
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%3d", i * k);
			}
			System.out.println();
		}

		System.out.println("=================");
		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				for (int j = 0; j <= 9; j++) {
					if (j == 0) {
						System.out.print("   |");
					} else {
						System.out.printf("%3d", j);
					}
				}
				System.out.println();
				System.out.println("---+---------------------------");
				System.out.printf("%2d |", i);
			} else {
				System.out.printf("%2d |", i);
			}
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%3d", i * k);
			}
			System.out.println();
		}

		System.out.println("=================");
		for (int i = 1; i <= 9; i++) {
			if (i == 1) {
				for (int j = 0; j <= 9; j++) {
					if (j == 0) {
						System.out.print("   |");
					} else {
						System.out.printf("%3d", j);
					}
				}
				System.out.println();
				System.out.println("---+---------------------------");
				System.out.printf("%2d |", i);
			} else {
				System.out.printf("%2d |", i);
			}
			for (int k = 1; k <= 9; k++) {
				System.out.printf("%3d", i + k);
			}
			System.out.println();
		}

		makingASquare();

	}

	static void makingASquare() {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.println("양수를 입력해주세요.");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

