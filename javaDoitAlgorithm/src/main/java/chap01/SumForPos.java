package chap01;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;

		System.out.println("1 부터 n 까지의 합을 구합니다.");

		do {
			System.out.println("n 의 값 : ");
			n = in.nextInt();
		} while (n <= 0);

		int sum = (1 + n) * ((n - 1 + 1) / 2);

		System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");

		subtract_b();
		singNumber();
	}

	static void subtract_b() {
		Scanner in = new Scanner(System.in);
		System.out.println("a 의 값 :");
		int a = in.nextInt();
		int b;
		do {
			System.out.println("b 의 값 :");
			b = in.nextInt();
			if (a >= b) {
				System.out.println(a + " a 보다 큰 값을 입력하세요!");
			}
		} while (a >= b);

		System.out.println("b - a : " + (b - a));

	}

	static void singNumber() {
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.println("양의 정수를 입력해주세요 : ");
			num = in.nextInt();
		} while (num < 0);

		System.out.println(num + " 수는 " + String.valueOf(num).length() + " 자리 입니다.");

	}
}
