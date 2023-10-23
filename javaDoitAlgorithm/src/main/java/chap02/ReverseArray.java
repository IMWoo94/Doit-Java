package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	// 배열 요소 1 과 2의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		System.out.println("a[" + idx1 + "] 와 a[" + idx2 + "] 를 교환합니다.");
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			Arrays.stream(a).forEach(o -> System.out.print(o + " "));
			System.out.println();
			swap(a, i, a.length - i - 1);
		}
	}

	static int sumOf(int[] a) {

		return Arrays.stream(a).sum();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("요솟수 : ");
		int num = in.nextInt();

		int[] x = new int[num];
		x = Arrays.stream(x).map(o -> in.nextInt()).toArray();

		// Arrays.sort(x);
		// Integer[] arr3 = Arrays.stream(x).boxed().toArray(Integer[]::new);
		// Arrays.sort(arr3, Collections.reverseOrder());
		// Arrays.sort(arr3, new Comparator<Integer>() {
		// 	@Override
		// 	public int compare(Integer o1, Integer o2) {
		// 		// o1 o2 같으면 0
		// 		// o1 이 o2 보다 앞에 오게 하려면 음수 리턴
		// 		// o1 이 o2 보다 뒤에 오려면 양수 리턴
		// 		return o1 - o2;
		// 	}
		// });
		reverse(x);

		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i : x) {
			System.out.println("i = " + i);
		}
		// for (Integer i : arr3) {
		// 	System.out.println("i = " + i);
		// }

		System.out.println("합계 : " + sumOf(x));
	}
}
