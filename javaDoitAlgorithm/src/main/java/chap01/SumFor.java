package chap01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("1 부터 n 까지의 합을 구합니다.");
		System.out.print("n 의 값 : ");
		int n = in.nextInt();

		int sum = 0;

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i == n) {
				sb.append(i + " = " + sum);
			} else {
				sb.append(i + " + ");
			}

		}
		System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");
		System.out.println(sb.toString());

		// 가우스
		gaussianSum(n);

		// a ~ b 사이의 합
		sumof(3, 5);
		sumof(6, 4);
	}

	static int gaussianSum(int n) {
		int sum = (1 + n) * (n - 1 + 1) / 2;
		System.out.println("1 부터 " + n + " 까지의 합은 " + sum + " 입니다.");
		return sum;
	}

	static int sumof(int a, int b) {
		int max = 0;
		int min = 0;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		int sum = (min + max) * (max - min + 1) / 2;
		System.out.println(min + " 부터 " + max + " 까지의 합은 " + sum + " 입니다.");
		return sum;
	}
}
