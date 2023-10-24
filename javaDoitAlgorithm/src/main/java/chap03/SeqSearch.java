package chap03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeqSearch {

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		// 보초법
		a[n] = key;

		while (true) {
			// if (i == n) {
			// 	return -1;
			// }
			if (a[i] == key) {
				break;
			}
			i++;
		}

		return i == n ? -1 : i;

	}

	static int seqSearchFor(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int seqSearchUser(int[] a, int n, int key) {
		List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());
		return collect.indexOf(key);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = in.nextInt();
		int[] x = new int[num + 1];

		x = Arrays.stream(x).map(o -> in.nextInt()).toArray();

		System.out.print("검색할 값 : ");
		int ky = in.nextInt();
		int idx = seqSearch(x, num, ky);
		// int idxF = seqSearchFor(x, num, ky);
		// int idxU = seqSearchUser(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다");
		} else {
			System.out.println(ky + " 은 x[" + idx + "]에 있습니다.");
			// System.out.println(ky + " 은 x[" + idxF + "]에 있습니다.");
			// System.out.println(ky + " 은 x[" + idxU + "]에 있습니다.");
		}
	}
}
