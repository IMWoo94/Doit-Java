package chap03;

import java.util.Scanner;

public class BinSearch {

	static int binSearchX(int[] a, int n, int key) {
		int pl = 0; // 검색범위 첫 인덱스
		int pr = n - 1; // 검색범위 마지막 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소 인덱스
			if (a[pc] == key) {

				// 검색 성공 시 앞으로 나아가서 중복된 값이 있다면 인덱스가 더 빠른 값을 던져준다.
				// 즉, 가장 첫 번째 일치하는 값을 주자.
				for (int i = pc; i > 0; i--) {
					if (a[i] == key) {
						continue;
					} else {
						return i;
					}
				}

				//return pc; // 검색 성공
			} else if (a[pc] < key) {
				pl = pc + 1;    // 검색 범위를 뒤쪽 절반으로 좁힌다.
			} else {
				pr = pc - 1;        // 검색 범위를 앞쪽 절반으로 좁힌다.
			}

		} while (pl <= pr);

		return -1;

	}

	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색범위 첫 인덱스
		int pr = n - 1; // 검색범위 마지막 인덱스

		do {
			int pc = (pl + pr) / 2; // 중앙 요소 인덱스
			if (a[pc] == key) {
				return pc;    // 검색 성공
			} else if (a[pc] < key) {
				pl = pc + 1;    // 검색 범위를 뒤쪽 절반으로 좁힌다.
			} else {
				pr = pc - 1;        // 검색 범위를 앞쪽 절반으로 좁힌다.
			}

		} while (pl <= pr);

		return -1;

	}

	static int binSearchFor(int[] a, int n, int key) {
		int pl = 0; // 검색범위 첫 인덱스
		int pr = n - 1; // 검색범위 마지막 인덱스

		for (int i = 0; i < n / 2; i++) {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;    // 검색 범위를 뒤쪽 절반으로 좁힌다.
			} else {
				pr = pc - 1;        // 검색 범위를 앞쪽 절반으로 좁힌다.
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("요솟수 : ");
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

		int idx = binSearch(x, num, ky);
		int idxF = binSearchFor(x, num, ky);
		int idxX = binSearchX(x, num, ky);
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println(ky + " 은 x[" + idx + "]에 있습니다.");
			System.out.println(ky + " 은 x[" + idxF + "]에 있습니다.");
			System.out.println(ky + " 은 x[" + idxX + "]에 있습니다.");
		}
	}
}
