package chap02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i : a) {
			if (i > max)
				max = i;
		}

		return max;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		// int num = in.nextInt();
		int num = random.nextInt(10);

		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		height = Arrays.stream(height).map(o -> (random.nextInt(90) + 100)).toArray();
		for (int i : height) {
			System.out.println("i = " + i);
		}
		System.out.println("최댓값은 " + maxOf(height) + " 입니다.");

		randomSeed1();
		System.out.println("===========================");
		randomSeed2();
	}

	static void randomSeed1() {
		Random random = new Random(5);

		for (int i = 0; i <= 5; i++) {
			System.out.println("randomSeed1 random.nextInt() = " + random.nextInt());
		}
	}

	static void randomSeed2() {
		Random random = new Random(5);

		for (int i = 0; i <= 5; i++) {
			System.out.println("randomSeed2 random.nextInt() = " + random.nextInt());
		}
	}
}
