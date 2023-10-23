package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		// triangleLB();
		// triangleLU();
		// triangleRB();
		// triangleRU();
		// spira();
		npira();

	}

	private static void triangleLB() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");

		do {
			System.out.println("몇단 삼각형 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void triangleLU() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다");

		do {
			System.out.println("몇단 삼각형 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void triangleRB() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다");

		do {
			System.out.println("몇단 삼각형 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (n - i < j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void triangleRU() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다");

		do {
			System.out.println("몇단 삼각형 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i < j + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	private static void spira() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("n 단 피라미드를 출력합니다.");

		do {
			System.out.println("몇단 피라미드 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void npira() {
		Scanner in = new Scanner(System.in);

		int n;

		System.out.println("n 단 숫자 피라미드를 출력합니다.");

		do {
			System.out.println("몇단 숫자 피라미드 입니까?");
			n = in.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}

}
