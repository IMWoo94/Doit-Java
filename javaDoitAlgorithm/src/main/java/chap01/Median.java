package chap01;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}

		// 위 방식보다 아래 방식으로 사용하게 되면 효율이 떨어진다.
		// 그 사유는 a 값이 중앙값으로 리턴을 하게 된다하면, 아래 방식은 최소 3개의 식에 대해서 확인을 해야 한다.
		// 하지만 위 방식의 경우 a 를 도달하기 위해서는 최대 2번의 식만 확인 하면 되므로 효율에 차이가 있다.
		// if ((b >= a && c <= a) || (b <= a && c >= a)) {
		// 	return a;
		// } else if ((a > b && c < b) || (a < b && c > b)) {
		// 	return b;
		// } else {
		// 	return c;
		// }
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a 의 값 : ");
		int a = stdIn.nextInt();

		System.out.println("b 의 값 : ");
		int b = stdIn.nextInt();

		System.out.println("c 의 값 : ");
		int c = stdIn.nextInt();

		System.out.println("중앙값은 " + med3(a, b, c) + " 입니다.");

	}
}
