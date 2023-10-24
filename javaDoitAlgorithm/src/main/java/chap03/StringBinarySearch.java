package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] x = {
			"abstract", "assert", "boolean", "break", " byte",
			"case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else"
		};

		System.out.println("원하는 키워드를 입력하세요 : ");
		String ky = in.next();

		int idx = Arrays.binarySearch(x, ky);
		int idxCompareTo = Arrays.binarySearch(x, ky, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int i1 = o1.length();
				int i2 = o2.length();
				if (i1 > i2) {
					System.out.println("양수");
				} else if (i1 < i2) {
					System.out.println("음수");
				} else {
					System.out.println("같음");
				}
				return o1.compareTo(o2);
			}
		});

		if (idx < 0) {
			System.out.println("해당 키워드가 없습니다 : " + idx);
		} else {
			System.out.println(ky + " 은 x[" + idx + "]에 있습니다.");
			System.out.println(ky + " 은 x[" + idxCompareTo + "]에 있습니다.");
		}
	}
}
